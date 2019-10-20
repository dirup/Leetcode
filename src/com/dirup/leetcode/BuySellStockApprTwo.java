package com.dirup.leetcode;

public class BuySellStockApprTwo {
	//try to get the min element so far and the max profit so far
	static double min = Double.MAX_VALUE;
	static double max = 0;
	public static int maxProfit(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
			if(arr[i] - min > max)
			{
				max = arr[i] - min;
			}
		}
		return (int) max;
	}

	public static void main(String[] args)
	{
		int[] n = {10, 12, 15, 9, 14, 13, 7, 8, 15};
		int p =maxProfit(n);
		System.out.println(p);
	}
}
