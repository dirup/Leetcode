package com.dirup.leetcode.apr15;

public class NumberToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		convertToBinart(n);

	}

	private static void convertToBinart(int n) {
		// TODO Auto-generated method stub
		String s= "";String comple ="";int j=0;String rev = ""; String last ="";
		while(n!=0)
		{
			s+=n%2;
			n = n/2;
		}
		System.out.println(s);
		for(int p=s.length()-1; p>=0; p--)
		{
			char ch = s.charAt(p);
			rev+=ch;
			
		}
		System.out.println(rev);
		
		for(int p=0; p<rev.length(); p++)
		{
			char ch = rev.charAt(p);
			if(ch == '0')
			{
				last+="1";
				j+=Math.pow(2, s.length()-1-p);
			}
			else {
				last+="0";
			}
			
		}
		System.out.println(last);
		System.out.println(j);
		
//		for(int j=i-1; j>=0; j--) {
//			System.out.print(bin[j]);
//			if(bin[j] == 0)
//			{
//				com[j] = 1;
//			}
//			else {
//				com[j] = 0;
//			}
//			//System.out.println();
//			System.out.print(com[j]);
//		}

	}

}
