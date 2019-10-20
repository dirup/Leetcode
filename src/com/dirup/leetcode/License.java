package com.dirup.leetcode;

public class License {

	public static String licenseKeyFormatting(String S, int K) {
		int count = 1;
		StringBuilder sb = new StringBuilder();
		String Str = S.toUpperCase();
		for(int i=Str.length()-1; i>=0; i--)
		{
			if(Str.charAt(i) != '-')
			{
				if(count <=K) {
					sb.append(Str.charAt(i));
					count =count+1;
				}
				else {
					sb.append("-").append(Str.charAt(i));
					count = 1;
					count++;
				}
			}
		}

		return sb.reverse().toString();

	}

	public static void main(String[] args)
	{
		String s = licenseKeyFormatting("2-5g-3-J",2);
		System.out.println(s);
	}

}
