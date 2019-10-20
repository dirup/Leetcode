package com.dirup.leetcode.may4;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = reverse(-123);
		System.out.println(p);
	}

	public static int reverse(int x) {
        int num =0;int rem =0;int sign =1;
        if(x<0)
        {
           sign =-1; 
        }
        while(Math.abs(x)>0)
        {
            rem = x%10;
            x = x/10;
            num = num*10 + rem;
        }
            return num;
    }
	
	 public static int reverseNum(int x) {
			// use long type to avoid overflow
	        long result=0;
			// postive and nagative condition
	        while(x!=0){
	            result = result*10+x%10;
	            x=x/10;
	        }
			return (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) 
	            ? 0 : (int) result;
	    }
}
