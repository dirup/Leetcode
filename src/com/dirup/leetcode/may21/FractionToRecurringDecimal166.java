package com.dirup.leetcode.may21;

import java.util.HashMap;

public class FractionToRecurringDecimal166 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 210;
		int n = 2;
		String s = fractionToDecimal(m,n);

	}
	public static String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) {
            return "0";
        }
        
        if(denominator == 0) {
            //throw new Exception("");
        }
        
        return fractionToDecimal((long) numerator, (long)denominator);
    }
     
    private static String fractionToDecimal(long numerator, long denominator) {
        StringBuilder res = new StringBuilder();
        boolean isNegative = false;
        if(numerator < 0) {
            numerator = - numerator;
            isNegative = ! isNegative;
        }
        
        if(denominator < 0) {
            denominator = - denominator;
            isNegative = ! isNegative;
        }
        
        if(isNegative) {
            res.append('-');
        }
        res.append(numerator/denominator);
        numerator = numerator % denominator;
        if(numerator == 0) {
            // can be fully devided and the result is integer.
            return new String(res);
        }
        
        // results is decimal
        res.append('.');
        int index = res.length();
        HashMap<Long, Integer> numeratorToIdx = new HashMap<Long, Integer>();
        while(numerator > 0) {
            if(numeratorToIdx.containsKey(numerator)) {
                break;
            }
            
            numerator *= 10; 
            res.append(numerator / denominator);
            numeratorToIdx.put(numerator / 10, index);
            numerator %= denominator;
            ++index;
        }
        
        if(numerator != 0) {
            // the fractional part is repeating.
            String repeatPattern = res.substring(numeratorToIdx.get(numerator));
            res.delete(numeratorToIdx.get(numerator), res.length());
            res.append('(');
            res.append(repeatPattern);
            res.append(')');
        }
        
        return new String(res);
    }

}
