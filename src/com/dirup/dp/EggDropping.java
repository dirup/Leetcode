package com.dirup.dp;

public class EggDropping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eggs = 2;
		int floors = 5;
		calculate(eggs,floors);
		

	}

	private static void calculate(int eggs, int floors) {
		int c = 0;
		int m[][] = new int[eggs+1][floors+1];
		for(int j=0;j<=floors;j++)
		{
			m[1][j] = j;
		}
		for(int e=2; e<=eggs; e++)
		{
			for(int f=1;f<=floors; f++)
			{
				m[e][f] = Integer.MAX_VALUE;
				for(int k=1;k<=f;k++)
				{
					if(e>f)
					{
						c = m[e-1][f];
					}
					else
					{
						c = 1+Math.max(m[e-1][k-1],m[e][f-k]);
					}
					
					if(c<m[e][f])
					{
						m[e][f] = c;
					}
				}
			}
		}
		for(int i=0; i<=eggs; i++)
		{
			for(int j=0; j<=floors; j++)
			{
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}

}
