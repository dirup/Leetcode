package com.dirup.leetcode.may21;

public class MinSizeSubArraySum {

	public static void main(String[] args) {
		int[] nums = {-28,81,-20,28,-29};
		System.out.println(minSubArrayLen(89,nums));
	}

	public static int minSubArrayLen(int s, int[] nums) {
		 if(nums.length == 0)
             return 0;
        int currSum = nums[0]; int minLength = Integer.MAX_VALUE;
      int start = 0,end=0;  
     //   for(int start =0,end=0; start<nums.length && end<nums.length; )
        	while(start <= end && end <nums.length)
        {
            if(currSum >= s)
            {
                System.out.println(start);
                minLength = Math.min(end - start +1, minLength);
                System.out.println("len"+minLength);
//                if(nums[start] < 0)
//            	{
//            		currSum+=nums[start];
//            	}
            	//else {
            		currSum-=nums[start];
            //	}
                
                start++;
            }
            else if(currSum<=s && end == nums.length-1) {
//            	if(nums[start] < 0)
//            	{
//            		currSum+=nums[start];
//            	}
            	//else {
            		currSum-=nums[start];
            //	}
                start++;
            }
            else{
                end++;
                
                if(end < nums.length)
                    currSum+=nums[end];
            }
            
            
        }
        return (minLength ==Integer.MAX_VALUE) ? -1:minLength;
	}
}
