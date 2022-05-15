package com.leetcode;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FindNearingZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= new int[] {9,5,-2,6,-1,2,7,-3};
		//int[] array= new int[] {0,5,1,6,2,7};
		findNearingZero(array);
	}
	public static Predicate<Integer> pr = new Predicate<Integer>() {

		@Override
		public boolean test(Integer t) {
			// TODO Auto-generated method stub
			return false;
		}
		
	};
	public static Consumer<Integer> cn = new Consumer<Integer>() {

		@Override
		public void accept(Integer t) {
			// TODO Auto-generated method stub
			
		}
		
	};
	public static void findNearingZero(int[] array) {
		
		int low =-1;
		int positive = array[0];
		int negative = array[0];
		Arrays.asList(array).stream().forEach(null);
		for(int high=1;high<array.length;high++) {
			low++;
			if(array[low] < array[high] && array[low] > 0 && positive > array[low]) {
				positive = array[low];
			}
			if(array[low] < array[high] && array[low] < 0) {
				negative = array[low];
			}
		}
		System.out.println(positive+"#"+negative);
	}
}
