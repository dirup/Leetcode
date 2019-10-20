package com.dirup.leetcode.mar5;

public class FibDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		System.out.println(fib(n));

	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		int[] fibCache = new int[n+1];int fibValue;
		for(int i=0 ;i<=n ;i++) {
			fibCache[i] = -1;
		}
		fibCache[0] = 0;
		fibCache[1] = 1;
		fibValue = fib(n,fibCache);
		return fibValue;
	}

	private static  int  fib(int n, int[] fibCache) {
		// TODO Auto-generated method stub
		if(fibCache[n] >=0)
			return fibCache[n];
		fibCache[n] = fib(n-1,fibCache)+fib(n-2,fibCache);
		return fibCache[n];
	}

}
