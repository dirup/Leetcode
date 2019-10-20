package com.dirup.leetcode.mar5;

public class Primes {
	public static void main(String[] args)
	{
		int n =999983;//499979
		int p = countPrimes(n);
		System.out.println(p);
	}
	public static int countPrimes(int n) {
    int[] prime = new int[n+1];
    int count = 0;
    for(int i=0 ;i<n ;i++)
    	prime[i] = 1;
    prime[0] = 0;
    prime[1] = 0;
    for(int i = 2; i < n; i++) {
        if(prime[i] == 1) {
            count++;
            for(int j = i; j <n ; j=j+i) {
            //    int v = i * j;
                prime[j] = 0;
            }
        }
    }
    return count;
  }
	
	public static int countPrime(int n) {
        boolean[] a = new boolean[n];
        int cnt=0;
        for(int i=2;i<n;i++){
                if(!a[i]){
                    cnt++;
                    for (int j = i; j < n; j=j+i) {
                    a[j] = true;
                }
                }
        }
        return cnt;
    }
}
