package com.dirup.dp;

import java.util.Arrays;

public class WeightedJobSchedulingWithMaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job[] jobs = new Job[6];
		jobs[0] = new Job(1,3,5);
		jobs[1] = new Job(2,5,6);
		jobs[2] = new Job(6,7,4);
		jobs[3] = new Job(4,6,5);
		jobs[4] = new Job(7,9,2);
		jobs[5] = new Job(5,8,11);
		
		WeightedJobSchedulingWithMaxProfit ws = new WeightedJobSchedulingWithMaxProfit();
		System.out.println(ws.maximun(jobs));
 	}
	public int maximun(Job[] jobs)
	{
		int[] maxProfit = new int[jobs.length];
		FinishTimeComparator ftc = new FinishTimeComparator();
		Arrays.sort(jobs, ftc);
		System.out.println(jobs);
		maxProfit[0] = jobs[0].profit;
		for(int i=0; i<jobs.length; i++)
		{
			maxProfit[i] = jobs[i].profit;
		}
		for(int i = 1; i<jobs.length; i++)
		{
		//	maxProfit[i] = Math.max(maxProfit[i-1], jobs[i].profit);
			for(int j = 0; j<i; j++)
			{
				if(jobs[j].end <= jobs[i].start)
				{
					maxProfit[i] = Math.max(maxProfit[i], maxProfit[j]+jobs[i].profit);
				}
			}
		}
		int maxVal = Integer.MIN_VALUE;
		for(int val:maxProfit)
		{
			if(val > maxVal)
				maxVal = val;
		}
		return maxVal;
	}
}
