/**
 * 
 */
package com.dirup.dp;

/**
 * @author dirup
 *
 */
public class Knapsack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val = {60,100,120};
		int[] wt = {1,2,3};
		int weight = 5;
		calculateVal(val,wt,weight);
	}

	private static void calculateVal(int[] val, int[] wt, int weight) {
		int[][] k = new int[wt.length+1][weight+1];
		for(int i=0,j=0;i<=wt.length; i++)
		{
				k[i][j] = 0;
		}
		for(int i=0,j=0;j<=weight; j++)
		{
				k[i][j] = 0;
		}
		for(int i=1; i<=wt.length; i++)
		{
			for(int j=1; j<=weight; j++)
			{
				if(wt[i-1] <= j)
					k[i][j] = Math.max(k[i-1][j],val[i-1]+k[i-1][j-wt[i-1]]);
				else
					k[i][j] = k[i-1][j];
			}
		}
		
		for(int i=0; i<=wt.length; i++)
		{
			for(int j=0; j<=weight; j++)
			{
				System.out.print(k[i][j]);
			}
			System.out.println();
		}
	}
	

}
