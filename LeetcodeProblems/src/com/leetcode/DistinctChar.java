package com.leetcode;

public class DistinctChar {

	static int distinctCount = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "test";
		//int distinctCount = 0;
		//findInnerDistinct(str, 0, str.length(),0);
		distinctCount = printLetter(str, 0, str.length()-1);
		System.out.println();
		startIteration(str,1,distinctCount);
		System.out.println(distinctCount);
	}

	public static int  startIteration(String str,int totalIteration, int distinctCount) {
		//	int totalIteration = 0;

		int lowerLimit = 0;
		int upperLimit;
		upperLimit = totalIteration;
		int length = str.length();
		//	if(totalIteration < (length-1)) {
		findInnerDistinct(str, lowerLimit, upperLimit,totalIteration);
	//	System.out.println("#"+distinctCount);
		return distinctCount;
		//	totalIteration++;
		//	}

	}
	public static int findInnerDistinct(String str,int lowerLimit,int upperLimit,int totalIteration) {
		
		int length = str.length();
		if(upperLimit == str.length()) {
			startIteration(str,totalIteration+1,distinctCount);
		}
		if(upperLimit < str.length()) {
			distinctCount = distinctCount + printLetter(str, lowerLimit, upperLimit);
		}
		else {
			return distinctCount;
		}
		System.out.println();
		lowerLimit++;
		upperLimit++;
		return findInnerDistinct(str, lowerLimit, upperLimit,totalIteration);
	}
	public static int  printLetter(String str,int lowerLimit,int upperLimit) {
		int distinctCount = 0;
		for(int i = lowerLimit;i<=upperLimit;i++) {
			int index  = str.indexOf(str.charAt(i));
			if (index == i){
				distinctCount = distinctCount+1;
			}
			System.out.print(str.charAt(i));
		}
		System.out.print(distinctCount);
		return distinctCount;
	}
}
