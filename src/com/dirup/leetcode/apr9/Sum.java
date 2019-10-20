/**
 * 
 */
package com.dirup.leetcode.apr9;

/**
 * @author dirup
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 *
 */
public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		int s = sum(a,b);
		System.out.println(s);
	}

	private static int sum(int a, int b) {
		while(b != 0) {
		int carry = a & b;
		 a = a ^ b;
		 b = carry << 1;
		
		}
		return a;
	}

}
