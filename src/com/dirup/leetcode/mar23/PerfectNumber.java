/**
 * 
 */
package com.dirup.leetcode.mar23;

import java.util.HashSet;

/**
 * @author dirup
 *We define the Perfect Number is a positive integer that is equal to the sum of all its positive divisors except itself.
 */
public class PerfectNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=1;
		boolean checkNum = checkPerfectNumber(n);
		System.out.println(checkNum);
	}
	public static boolean checkPerfectNumber(int num) {
        int sum=0;
        HashSet hs = new HashSet();
        if(num >1) {
        	for(int i=2; i<Math.sqrt(num);i++){
        		if(num % i == 0)
        		{
        			if(!hs.contains(i)) {
        				hs.add(i);
        				hs.add(num/i);
        				sum+=i;
        				sum+=num/i;
        			}
        		}
        	}
        
        if(sum+1 == num)
        	return true;
        else
        	return false;
        }
        return false;
    }
}
