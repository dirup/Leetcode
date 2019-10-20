package com.dirup.leetcode;

public class BuySellStock {
	
	
	    public static int maxProfit(int[] prices) {
	        int max[] = new int[prices.length];
	        int maxNum = 0;
	        int profit[] = new int[prices.length];
	        for(int i=0; i<prices.length-1; i++)
	        {
	            for(int j = i; j<prices.length-1; j++)
	            {
	                if(prices[j+1] > max[i] )
	                {
	                    max[i] = prices[j+1];
	                }   
	            }
	            
	        }
	        for(int p = 0;p<prices.length; p++)
	        {
	            profit[p] = max[p] - prices[p] ;
	            if(profit[p] >maxNum)
	            {
	                maxNum = profit[p];
	            }
	        }
	        return maxNum;
	        
	    }
	    
	    public static void main(String[] args) {
	    	int prices[] = {7,1,5,3,6,4};
	    	int q=maxProfit(prices);
	    	System.out.println(q);
	    }
	
}
