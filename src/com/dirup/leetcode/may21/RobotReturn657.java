package com.dirup.leetcode.may21;

import java.util.HashMap;

public class RobotReturn657 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "UDDUURLRLLRRUDUDLLRLURLRLRLUUDLULRULRLDDDUDDDDLRRDDRDRLRLURRLLRUDURULULRDRDLURLUDRRLRLDDLUUULUDUUUUL";
		boolean val = judgeCircle(s);
		System.out.println(val);
	}

	public static boolean judgeCircle(String moves) {
        HashMap<Character, Integer> data = new HashMap<>();
        data.put('U',1);
        data.put('D',-1);
        data.put('L',-2);
        data.put('R',2);
        int count = 0;
        for(int i=0; i<moves.length(); i++)
        {
           char ch = moves.charAt(i);
          // System.out.println(count);
           count+=data.get(ch); 
           System.out.println(count);
        }
        if(count == 0)
            return true;
        return false;
    }
}
