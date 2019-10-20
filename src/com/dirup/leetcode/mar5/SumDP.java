package com.dirup.leetcode.mar5;

public class SumDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(sum(n));
	}

	private static int sum(int n) {
		// TODO Auto-generated method stub
		int[] sumCache = new int[n+1];int sumValue;
		for(int i=0;i <n; i++)
		{
			sumCache[i] = -1;
		}
		sumCache[0] = 0;
		sumCache[1] = 1;
		sumValue = sum(n, sumCache);
		return sumValue;
	}

	private static int sum(int n, int[] sumCache) {
		// TODO Auto-generated method stub
		if(sumCache[n] > 0)
			return sumCache[n];
		sumCache[n] = sum(n-1,sumCache)+n;
		return sumCache[n];
	}

}
