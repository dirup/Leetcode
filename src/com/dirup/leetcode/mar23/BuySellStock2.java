package com.dirup.leetcode.mar23;

/**
 * @author dirup
 *Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
 */
public class BuySellStock2 {

	public static void main(String[] args) {
		int arr[] = {7,1,5,3,6,4};
		int maxProfit = calcProfit(arr);
		System.out.println("maxProfit:" + maxProfit);
	}
	
	 public static int calcProfit(int[] prices) {
	        int profit=0;
	        for(int i =1; i<prices.length; i++)
	        {
	            if(prices[i]>prices[i-1])
	            {
	                profit+=prices[i] - prices[i-1];
	            }
	        }
	        return profit;
	    }

}
