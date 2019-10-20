package com.dirup.leetcode.may4;

public class Compress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = {'a','a','b','b','c','c','c','c','c','c','c','c','c','c','c'};
		String str = "aabbccc";
	//	char[] ch = str.toCharArray();
		int n = compression(ch);
		System.out.println(n);
		
	}

	private static int compression(char[] chars) {
	        int indexAns = 0, index = 0;
	        while(index < chars.length){
	            char currentChar = chars[index];
	            int count = 0;
	            while(index < chars.length && chars[index] == currentChar){
	                index++;
	                count++;
	            }
	            chars[indexAns++] = currentChar;
	            if(count != 1)
	                for(char c : Integer.toString(count).toCharArray()) 
	                    chars[indexAns++] = c;
	        }
	        return indexAns;
	    }

}
