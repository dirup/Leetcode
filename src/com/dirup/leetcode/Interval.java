package com.dirup.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Interval {
	int start;
	int end;
	Interval() { start = 0; end = 0; }
	Interval(int s, int e) { start = s; end = e; }
}

class Solution {
	public void findRightInterval(Interval[] intervals) {
		Map<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
		for(int i =0 ; i<intervals.length; i++)
		{
			hm.put(intervals[i].start, intervals[i].end);

		}
			TreeSet s = (TreeSet) hm.keySet();
		for(Map.Entry<Integer,Integer> en : hm.entrySet())
		{
			
		}


		//return new int[];
	
	
	Map<String,String> gfg = new HashMap<String,String>();
    
    // enter name/url pair
    gfg.put("GFG", "geeksforgeeks.org");
    gfg.put("Practice", "practice.geeksforgeeks.org");
    gfg.put("Code", "code.geeksforgeeks.org");
    gfg.put("Quiz", "quiz.geeksforgeeks.org");
     
    // using for-each loop for iteration over Map.entrySet()
    for (Map.Entry<String,String> entry : gfg.entrySet()) 
        System.out.println("Key = " + entry.getKey() +
                         ", Value = " + entry.getValue());
}
}
