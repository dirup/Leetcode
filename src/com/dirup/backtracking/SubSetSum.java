package com.dirup.backtracking;

public class SubSetSum {
	public static void sum(int[] A, int currSum, int index, int sum, int[] soln)
	{
		if(currSum == sum)
		{
			System.out.println("found sum");
			for(int i =0; i<soln.length; i++)
			{
				if(soln[i] == 1)
				{
					System.out.println(" "+ A[i]);
				}
			}
		}
		else if (index == A.length)
			return;
		else {
			soln[index] = 1;
			currSum += A[index];
			sum(A, currSum, index+1, sum, soln);
			soln[index] = 0;
			currSum -= A[index];
			sum(A, currSum, index+1, sum, soln);
		}
	}
	
	public static void main(String[] args)
	{
		int[] A = {5,3,7,6,10};
		int[] soln = new int[A.length];
		sum(A,0,0,15,soln);
	}
}
