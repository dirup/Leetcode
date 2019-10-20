package com.dirup.dp;

import java.util.Comparator;

public class FinishTimeComparator implements Comparator<Job>{
	@Override
	public int compare(Job j1, Job j2) {
		// TODO Auto-generated method stub
		if(j1.end >= j2.end)
			return 1;
		else
			return -1;
	}

}
