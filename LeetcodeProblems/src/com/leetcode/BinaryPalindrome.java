package com.leetcode;

public class BinaryPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binaryString="0100101";  
		int decimal=Integer.parseInt(binaryString,2);  
		System.out.println(decimal);  
		int count = countSwap(binaryString);
		System.out.println("cunt#"+count);
		binaryString="1001001";  
		int decimal1=Integer.parseInt(binaryString,2);  
		System.out.println(decimal1);  
	}

	static int countSwap(String str)
	{
		int n = str.length();
		char[] s = str.toCharArray();

		// Counter to count minimum
		// swap
		int count = 0;

		// A loop which run in half
		// string from starting
		for (int i = 0; i < n / 2; i++) {

			// Left pointer
			int left = i;

			// Right pointer
			int right = n - left - 1;

			// A loop which run from
			// right pointer to left
			// pointer
			while (left < right) {

				// if both char same
				// then break the loop
				// if not same then we
				// have to move right
				// pointer to one step
				// left
				if (s[left] == s[right]) {
					break;
				}
				else {
					right--;
				}
			}

			// it denotes both pointer at
			// same position and we don't
			// have sufficient char to make
			// palindrome string
			if (left == right) {
				return -1;
			}
			else {
				for (int j = right; j < n - left - 1; j++) {
					char t = s[j];
					s[j] = s[j + 1];
					s[j + 1] = t;
					count++;
				}
			}
		}

		return count;
	}
	//reverse character array
	static void reverse(char a[])
	{
		int n=a.length;
		char[] b = new char[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}
	}

}
