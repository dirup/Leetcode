package com.dirup.leetcode.mar5;

import java.util.ArrayList;
import java.util.List;

public class FindClose {
	
	public static void main(String[] args)
	{
		int[] arr = {0,0,1,2,3,3,4,7,7,8};
		int k = 3, x= 5;
		List<Integer> li = findList(arr, k, x);
		System.out.println(li);
		
	}

	    private static List<Integer> findList(int[] arr, int k, int x) {
	    	List<Integer> list = new ArrayList<>();
	        if(arr.length == 1) { list.add(arr[0]); return list; }

	        int idx = findClosestElements(arr, k,x);
	        int i, j;
	        if(idx < 0)  {
                idx = -(idx + 1);
            i = idx - 1; j = idx;                                    
               while(k-- > 0){
                   if(i<0 || (j<arr.length && (Math.abs(arr[i]) - x) > Math.abs(arr[j] - x) ))j++;
                   else i--;
               }
            }
	        else {
	         i = idx;
	         j = idx;

	        k--;
	        
	        while(k > 0) {
	             if(i-1 >= 0 && j+1 < arr.length) {
	                 if(Math.abs(x - arr[i-1]) <= Math.abs(x - arr[j+1])) {
	                     i--;
	                 } else {
	                     j++;
	                 }
	             } else if(i > 0) {
	                 i--;
	             } else {
	                 j++;
	             }
	             k--;
	         }
	        }  
	         for(k = i; k <= j; k++) {
	             list.add(arr[k]);
	         }
	        
	        return list;
	    }

		public static int findClosestElements(int[] arr, int k, int x) {
	        return findClose(arr, k, x, 0,arr.length);
	    }
	    
	    public static int findClose(int[] arr, int k, int x, int start, int last)
	    {
	    	if(x < arr[0]) {
	            return arr[0];
	        }
	        if(x > arr[arr.length-1]) {
	            return arr[arr.length-1];
	        }
	        int mid =0;
	        while(start < last) {
	             mid = (start + last)/2;
	            if (arr[mid] == x)
	            {
	                 return mid;
	            }
	            else if (arr[mid] < x)
	            {
	            	start = mid+1;
	               return findClose(arr, k, x, start, last);
	            }
	            else {
	            	last = mid;
	               return findClose(arr, k, x, start, last);
	            }
	         }
	         return last-1 ;
	       }
	  
	}

