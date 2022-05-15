package com.leetcode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class AmazonPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] input = new String[5][2];
		input[0][0] = "INSERT";
		input[0][1] = "GNQRSTUV109";
		input[1][0] = "INSERT";
		input[1][1] = "GNQRSTUV908";
		input[2][0] = "SHIP";
		input[2][1] = "-";
		input[3][0] = "INSERT";
		input[3][1] = "GNQRSTUV654";
		input[4][0] = "SHIP";
		input[4][1] = "-";
		int allowedPackPerShip = 3;
		performWareHouseQueries(input,allowedPackPerShip);
	}
	public static String[] performWareHouseQueries(String[][] input, int allowedPackPerShip){
		String[] output = new String[2];
		Queue<String> packageQueue = new LinkedList<String>();
		int  outputIndex = 0;
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<2;j++) {
				if(input[i][j].equalsIgnoreCase("SHIP") && packageQueue.size() >= allowedPackPerShip) {
					//	output[output.length-1][0] = "SHIP";
					String[] packs = new String[allowedPackPerShip];
					Iterator<String> itr = packageQueue.iterator();
					int totalPackCount = 0;
					while (itr.hasNext() && totalPackCount < allowedPackPerShip)
					{
						packs[totalPackCount] = packageQueue.poll();
						totalPackCount++;
					}
					System.out.println("SHIP-"+packs);
					output[outputIndex]= Arrays.toString(packs);
					outputIndex++;
					j++;
				}
				else if(input[i][j].equalsIgnoreCase("SHIP") && packageQueue.size() < allowedPackPerShip) {
					System.out.println("SHIP-"+"NA");
					output[outputIndex]="N/A";
					outputIndex++;
					j++;
				}
				else {
					j++;
					packageQueue.add(input[i][j]);
				}
			}
		}
		return output;
	}

}
