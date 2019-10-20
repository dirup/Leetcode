package com.dirup.leetcode.may4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15}; int target =9;
		int[] arr = twoSum(nums,target);
		

	}

	private static int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm = new HashMap();
        List<Integer> li = new ArrayList<Integer>(); int arr[] = new int[10];int p=0;
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],i);
            
        }
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(target-nums[i])){
                //li.add(i); 
                arr[p++] = i;
                //li.add(hm.get(target-nums[i]));
                arr[p++] = hm.get(target-nums[i]);
            }
        }
        return arr;
	}
	public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException();
    }

}
