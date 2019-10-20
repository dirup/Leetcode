package com.dirup.leetcode.may21;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int n = trap(height);
		System.out.println(n);

	}
	public static int trap(int[] height) {
        int left =0, right = height.length;
        int maxLeft=0, maxRight=0,ans=0;
        while(left<right)
        {
            if(height[left] < height[right])
            {
              if(left > maxLeft)
              {
                  maxLeft = left;
              }
              else{
                    ans+= (maxLeft - height[left]);
                }
                left++;
            }
            else{
               if(right>maxRight)  
               {
                   maxRight = right;
               }
                else{
                    ans+= (maxRight - height[right]);
                }
                right--;
            }
            
        }
        return ans;
    }

}
