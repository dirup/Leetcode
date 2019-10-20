package com.dirup.leetcode.may4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class BestStudentAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] students = {{"Jerry","65"},{"Bob","1"},{"Jerry","23"},{"Jerry","100"},{"Eric","83"}};
		calculateAvg(students);

	}

	private static void calculateAvg(String[][] students) {
		HashMap<String,List> hm = new HashMap<String,List>(); 
		HashMap<String, Integer> hmap = new HashMap();
		for(int i=0; i<students.length;i++)
		{
			if(hm.get(students[i][0]) == null)
			{
				ArrayList al = new ArrayList();
				al.add(students[i][1]);
				hm.put(students[i][0], al);
			}
			else {
				List li = hm.get(students[i][0]);
				li.add(students[i][1]);
				hm.put(students[i][0], li);
			}
		}
		for(String k :hm.keySet()) {
			List<String> li = hm.get(k);int sum =0;
			Iterator<String> it = li.iterator();
			while(it.hasNext()) {
				sum=sum+Integer.parseInt(it.next());
			}
			hmap.put(k, sum/li.size());
			
		}
		System.out.println(hmap);
	}

}
