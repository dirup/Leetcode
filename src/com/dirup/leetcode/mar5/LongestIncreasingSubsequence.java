package com.dirup.leetcode.mar5;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[] = {0,4,12,2,9,13,3,11,7,14};
		int lis[] = new int[arr.length];
		int index[] = new int[arr.length];
		int max =0;
		for(int i=0;i<arr.length;i++)
		{
			lis[i] =1;
		}
		for(int i=1;i<arr.length;i++) 
		{
			for(int j=0; j<i; j++)
			{
				if(arr[j] < arr[i] && lis[i] < lis[j]+1)
				{
					lis[i] =  lis[j] + 1;
					index[i] = j;
					if(lis[i] > max)
					{
						max = lis[i];
					}
				}
			}
		}
		System.out.println(max);
		for(int i =0; i<index.length; i++)
		{
			System.out.print(index[i]);
		}
	}

}
