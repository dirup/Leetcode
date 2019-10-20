package com.dirup.leetcode.mar5;

public class DecodeWays {
	public static void main(String[] args) {
		char[] arr = {'0'};
		//char[] arr = {'1','1','2','3', '5'};
		System.out.println(decodeWays(arr, arr.length-1));
	}

	private static int decodeWays(char[] arr, int index) {
		int n = index;int count = 0;
		if(n == 0 || n == 1) {
			return 1;
		}
		if(arr[n-1] > '0') {
			count = decodeWays(arr,n-1);
		}
		if((arr[n-2] == '1') || (arr[n-2] == '2' && arr[n-1] < '7')){
			count = count+decodeWays(arr,n-2);
		}
		return count;
	}
	
	
	
}
