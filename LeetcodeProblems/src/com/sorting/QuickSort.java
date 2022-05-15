package com.sorting;

public class QuickSort {

	public static void main(String[] args)
	{
		int[] arr = { 12,18,15,21,19,30,4,17 };
		int n = arr.length;

		quickSort(arr, 0, n - 1);
		System.out.println("Sorted array: ");
		//   printArray(arr, n);
	}
	public static void quickSort(int[] arr,int low,int high) {
		if(low<high) {
			int pivot = partition(arr, low, high);
			System.out.println();
		}
	}
	static int partition(int[] arr, int low, int high)
	{
		int pivot = arr[high];

		for(int i=low;i<high-1;i++) {
			if(arr[i]>pivot) {
				swap(arr,i,high);
			}
		}
		return pivot;
	}
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
