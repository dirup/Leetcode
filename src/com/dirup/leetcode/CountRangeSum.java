package com.dirup.leetcode;

public class CountRangeSum {
	 public static int countRangeSum(int[] nums, int lower, int upper) {
	        
	        
	        int count = 0;
	        for(int i=0; i<nums.length; i++)
	        {
	            long sum=0;
	            for(int j=i; j<nums.length; j++)
	            {
	                
	                sum = sum + nums[j];
	                if(lower <= sum  && sum <= upper)
	                {
	                    count++;
	                }
	            }
	        }
	        return count;
	    }
	
	 public static void main(String[] args)
	 {
		 int[] nums = {-2147483647,0,-2147483647,2147483647};
		int p = countRangeSum(nums, -564, 3864);
		System.out.println(p);
	 }
}
