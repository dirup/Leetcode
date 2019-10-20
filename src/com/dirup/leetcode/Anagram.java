package com.dirup.leetcode;

public class Anagram {
	public static boolean isAnagram(String s, String t)
	{
	        if(s.length()!=t.length()) return false;
	            int[] charCount= new int[256];
	            for(int i=0; i<s.length(); i++)
	            {
	                charCount[s.charAt(i)]++;
	            }
	            for(int i=0; i<t.length();i++)
	            {
	                 if(charCount[t.charAt(i)]<1) return false;
	                charCount[t.charAt(i)]--;
	            }
	            return true;  
	    		
	    }
	public static void main(String[] args)
	{
		boolean b = isAnagram("ratccc","carpcc");
		System.out.println(b);
	}
}
