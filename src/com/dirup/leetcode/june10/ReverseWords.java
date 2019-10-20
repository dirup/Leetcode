package com.dirup.leetcode.june10;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "the  sky is blue";
		reverseWords(s);
	}

	public static String reverseWords(String s)
	{
		 String[] str = s.trim().split(" ");
         StringBuilder sb = new StringBuilder();
         for(int i=str.length-1; i>=0; i--)
         {
                if(!str[i].isEmpty()){
             sb.append(str[i]);
             if(i>0)
                 sb.append(" ");
                }
         }
         return sb.toString();
	}
}
