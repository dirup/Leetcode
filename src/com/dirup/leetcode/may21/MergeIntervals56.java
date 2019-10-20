package com.dirup.leetcode.may21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals56 {

	public static void main(String[] args) {
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		int[][] list = merge(intervals);
		System.out.println();
		
	}
		
	public static int[][] merge(int[][] intervals) {
        if(intervals.length == 0 || intervals.length ==1)
            return intervals;
        int len = intervals.length;
        List<int[]> mergeInt = new ArrayList<>();
        List<int[]> last = new ArrayList<>();
        for(int i=0; i<intervals.length; i++)
        {
            mergeInt.add(intervals[i]);
        }
        Collections.sort(mergeInt,new MergeComparator());
        
        int[] firstInt = mergeInt.get(0);
        int start = firstInt[0];
        int end = firstInt[1];
        for(int i=1; i< len; i++)
        {
            if(end >= mergeInt.get(i)[0])
            {
                end = Math.max(mergeInt.get(i)[1],end);
            }
            else{
                last.add(new int[]{start,end});
                start = mergeInt.get(i)[0];
                end = mergeInt.get(i)[1];
            }
        }
        last.add(new int[]{start,end});
       
        int[][] res = new int[last.size()][2];
        for (int i = 0; i < last.size(); i++) {
            res[i] = last.get(i);
        }
         return res;   
    }
}
		     class MergeComparator implements Comparator<int[]> {
		        public int compare(int[] a, int[] b)
		        {
		            return a[0]-b[0];
		        }
		    }
	


