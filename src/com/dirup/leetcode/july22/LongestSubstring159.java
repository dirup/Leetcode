package com.dirup.leetcode.july22;

import java.util.HashMap;

public class LongestSubstring159 {

	public static void main(String[] args) {
		int m = lengthOfLongestSubstringTwoDistinct("eceba");	
		System.out.println(m);
	}
	 public static int lengthOfLongestSubstringTwoDistinct(String s) {
	        char[] ch = s.toCharArray();
	        return lengthOfString(ch);
	    }
	    public static int lengthOfString(char[] ch)
	    {
	        int max =1;
	        for(int i=0;i<ch.length;i++)
	        {
	        	HashMap<Character,Integer> hm = new HashMap<>();//System.out.println(hm);
	            for(int j=i;j<ch.length;j++)
	            {
	              // System.out.println(hm);
	                if(!hm.containsKey(ch[j]))
	                {
	                    hm.put(ch[j],1);
	                }
	                else {
	                    hm.put(ch[j],hm.get(ch[j])+1);
	                }
	                if(hm.size() == 1 || hm.size() == 2)
	                {
	                    max = Math.max(max,j-i+1);
	                }
	            }
	           //  System.out.println(hm);
	        }
	       
	        return max;
	    }

}
