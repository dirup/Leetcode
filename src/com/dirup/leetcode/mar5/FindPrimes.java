package com.dirup.leetcode.mar5;

import java.util.Date;

public class FindPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(milliTime);
		long startTime = System.nanoTime();
		System.out.println(startTime);
		int count = 0;int primeCount = 0;int n=999983;
		int[] prime = new int[n];
		
        for(int i=2; i<n; i++)
        {
        	if(prime[i] == 0) {
	           int p = findPrime(i);
	            if(p == 1)
	            {
	            	prime[i] = 1;
	                primeCount++;
	            } 
        	}
        	else 
        		primeCount++;
        }
        long endTime   = System.nanoTime();
        System.out.println(endTime);
        System.out.println("time diff:" + (endTime - startTime));
        System.out.println(primeCount);
        
     //   findPrime(n);
        
	}

	private static int findPrime(int n) {
		int cnt =0; 
		for(int j=2; j<=Math.sqrt(n); j++)
		{
			if(n%j == 0)
			{
				cnt++;
			}
		}
		if(cnt == 0)
		{
		//	System.out.println("prime");
			return 1;
		}
		else {
		//	System.out.println("Not");
			return 0;
		}
	}

}
