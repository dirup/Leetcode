package com.dirup.leetcode.may4;

public class Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int p = countPrimes(n);
		System.out.println(p);
	}

	private static int countPrimes(int n) {
		boolean[] val = new boolean[n];
		int count =0;
		for(int i=2;i<n; i++)
		{
			if(!val[i])
			{
				count++;
				for(int j=i; j<n; j=j+i)
				{
					val[j] = true;
				}
			}
		}
		return count;
	}

}
