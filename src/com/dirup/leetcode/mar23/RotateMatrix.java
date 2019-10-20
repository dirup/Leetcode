/**
 * 
 */
package com.dirup.leetcode.mar23;

/**
 * @author dirup
 * You are given an n x n 2D matrix representing an image.

   Rotate the image by 90 degrees (clockwise).
 */
public class RotateMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		printMat(mat);
		rotateMatrix(mat);
		System.out.println();
		printMat(mat);
		
		
	}

	private static void printMat(int[][] mat) {
		for(int i=0; i<mat.length ;i++) {
			for(int j=0; j<mat.length; j++)
			{
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
			
	}

	private static void rotateMatrix(int[][] mat) {
		int N = mat.length;
		int n = mat.length-1;
		for(int i=0; i<N/2;i++)
		{
			for(int j=i; j<N-i-1; j++)
			{
				int temp = mat[i][j];
				mat[i][j] = mat[n-j][i];
				mat[n-j][i] = mat[n-i][n-j];
				mat[n-i][n-j] = mat[j][n-i];
				mat[j][n-i] = temp;
			}
		}
	}

}
