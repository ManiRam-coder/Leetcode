package com.leetcode;
//Input: coins = [1,2,5], amount = 11
//Output: 3
//Explanation: 11 = 5 + 5 + 1
public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coinarray = new int[] {1,2,5};
		int amount = 11;

		int[] dp = new int[11+1];
		dp[0] = 0;
		int previousAmount = 0;
		for(int i=1;i<=amount;i++) {
			for(int j=0;j<coinarray.length;j++) {
				if(i == coinarray[j]) {
					dp[i] = 1;
					break;
				}
				else if(coinarray[j] < i) {
					dp[i] = dp[i]+1;
				}
				/*else if(i == coinarray[j]) {
					dp[i] = 1;
				}*/
			}
		}
		System.out.println(dp);
	}
}
