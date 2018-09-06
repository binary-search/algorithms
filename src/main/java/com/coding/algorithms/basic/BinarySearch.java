package com.coding.algorithms.basic;

public class BinarySearch {
	
	private static int search(int arr[],int num,int start, int end) {
		if(start > end)return -1;
		int mid = start + (end-start)/2;
		return arr[mid] == num ? mid : (num > arr[mid] ? search(arr,num,mid+1,end) : search(arr,num,start,mid-1));
	}
	
	public static int binarySearch(int arr[], int num) {
		return search(arr,num,0,arr.length-1);
	}
	
	public static void main(String[] args) {
		int arr[]= {0,2,3,4,5,6};
		System.out.println("Number found at: "+binarySearch(arr,5));
	}
}
