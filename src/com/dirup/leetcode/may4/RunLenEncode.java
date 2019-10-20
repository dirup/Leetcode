package com.dirup.leetcode.may4;

import java.util.HashMap;
import java.util.Map;

public class RunLenEncode {

	public static void main(String[] args) {
		String input = "wwwwaaadexy";
	//	System.out.println(getEncoded(input));
		System.out.println(compress(input));
	}
	
	
	public static String getEncodedString(String input){
		char[] inputCharArray = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		int count = 1;
		char temp = 0;
		for(int i=0; i<inputCharArray.length; i++){
			if(temp == inputCharArray[i]){
				count=count+1;
			}else{
				if(i!=0){
					sb.append(count);
				}
				temp = inputCharArray[i];
				sb.append(temp);
				count=1;
			}
		}
		//append the last count
		sb.append(count);
		return sb.toString();
	}
	public static String getEncoded(String input){
		int i=0;char ch = input.charAt(i);int count =1;StringBuilder sb = new StringBuilder();
		while(i<input.length()-1)
		{
			if(ch == input.charAt(i+1)) {
				count++;
				i++;
				ch = input.charAt(i);
			}
			else {
				sb.append(ch).append(count);
				count =1;
				i++;
				ch = input.charAt(i);
			}
		}
	//	System.out.println(sb.toString());
		return sb.append(ch).append(count).toString();
		
	}
	
	public static String compress(String str)
	{
		Map<Character,Integer> hm = new HashMap<>();
		//char currentChar = str.charAt(0);
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++)
		{
			char iter = str.charAt(i);
			if(hm.containsKey(iter))
			{
				hm.put(iter, hm.get(iter)+1);
			}
			else {
				hm.put(iter, 1);
			}
				
		}
		char ref = str.charAt(0);
		for(int i=0; i<str.length();i++)
		{
			
			char currentChar = str.charAt(i);
			
//			char prev = str.charAt(0);
//			if(prev == currentChar)
//			{
//				continue;
//			}
//			else {
//				
//			}
			if(ref == currentChar)
			{
				continue;
			}
			else {
				sb.append(ref).append(hm.get(ref));
				ref = currentChar;
			}
			
		}
		sb.append(ref).append(hm.get(ref));
		return sb.toString();
		
	}
}
