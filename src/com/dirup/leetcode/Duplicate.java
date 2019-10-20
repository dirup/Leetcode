package com.dirup.leetcode;

import java.util.ArrayList;

public class Duplicate {
	public static void findDuplicate(int[] arr)
	{
		ArrayList al = new ArrayList();
		for(int i=0; i<= arr.length-1; i++)
		{
			int idx = Math.abs(arr[i])-1;
			if(arr[idx] <0)
			{
				al.add(Math.abs(arr[i]));
				
			}
			else
			{
				arr[idx] *= -1;
			}
		}
		System.out.println(al);
	}
	
	public static void main(String[] args)
	{
		int[] arr = {4,3,2,7,8,2,3,1};
		findDuplicate(arr);
		
	}
}
