package com.dirup.leetcode.mar30;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int d =3;
		int[]p = rotate(a,d);
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}
		
	}

	private static int[] rotate(int[] a, int d) {
		int count = d;int temp =-1;
		while(d>0) {
			int  i=0;
			temp = a[i];
			for(;i<a.length-1;i++)
			{
				
				a[i] = a[i+1];
				
			}
			a[i] = temp;
			d--;
		}
		return a;
	}

}
