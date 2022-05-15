package com.array;

//https://leetcode.com/problems/median-of-two-sorted-arrays/
public class MedianOfArray {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,5,8};
		int[] b = new int[] {4,6,7};
		//sortArray(a, null);
		findMedian(a, b);
	}

	public static void findMedian(int[] nums1, int[] nums2) {
		int tempLength =(nums1.length+nums2.length);
		int[] k = new int[tempLength];
		int i=0;
		int j=0;
		int index = -1;
		double result = 0;
		while(index <= tempLength && i<nums1.length && j<nums2.length) {
			if(nums1[i] < nums2[j] ) {
				index = index+1;
				k[index] = nums1[i];
				i++;
			}
			else if(nums1[i] > nums2[j]) {
				index = index+1;
				k[index] = nums2[j];
				j++;
			}
		}
		if(i>=nums1.length) {
			for(int l=j;l<nums2.length;l++) {
				index = index+1;
				k[index] = nums2[l];
			}
		}
		else if(j>=nums2.length) {
			for(int l=i;l<nums1.length;l++) {
				index = index+1;
				k[index] = nums1[l];
			}
		}
		if(k.length%2==0) {
			System.out.println("Even");
			int left = (k.length-2)/2;
			int left1 = k[left];
			int left2 = k[left+1];
			result = (double)(left1+left2)/2;
		}
		else {
			int left = (k.length)/2;
			result = (k[left]);
		}
		System.out.println(result);
	}

	public static double sortArray(int[] nums1, int[] nums2) {
		for(int i=0;i<nums1.length;i++) {
			if(!(i == nums1.length-1) && (nums1[i]>nums1[i+1])) {
				int temp = nums1[i+1];
				//int temp = nums1[i];
				nums1[i+1] = nums1[i];
				nums1[i] = temp;
			}
		}
		System.out.println(nums1);
		return 0;

	}
}

