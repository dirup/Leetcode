package com.dirup.dp;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRooms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job[] jobs = new Job[9];//start time : 0,1,2,4,5,5,6,7,15,30
		jobs[0] = new Job(0,30,0);
		jobs[1] = new Job(5,10,0);
		jobs[2] = new Job(15,20,0);
		jobs[3] = new Job(1,3,0);
		jobs[4] = new Job(2,5,0);
		jobs[5] = new Job(6,7,0);
		jobs[6] = new Job(4,6,0);
		jobs[7] = new Job(7,9,0);
		jobs[8] = new Job(5,8,0);
		
		calculate(jobs);
		

	}

	private static void calculate(Job[] jobs) {
		int count = 1;
		Arrays.sort(jobs, new Comparator<Job>(){
			public int compare(Job a, Job b)
			{
				return a.start - b.start;
			}
		});
		for(int i=0; i<jobs.length-1 ;i++)
		{
			if(jobs[i].end > jobs[i+1].start)
			{
				count+=1;
			}
		}
		System.out.println("Meeting Rooms required:"+count);
	}

}
