package com.dirup.leetcode.mar5;

import java.util.ArrayList;
import java.util.List;

public class FIndCloseElements {
	
	public static void main(String[] args)
	{
		int[] arr = {0,0,1,2,3,3,4,7,7,8};
		List<Integer> l = findClosestElements(arr, 3,5);
		System.out.println(l);
	}
	public static List<Integer>findClosestElements(int[] arr, int k,int x){
	List<Integer> list = new ArrayList<>();
    if(arr.length == 1) { list.add(arr[0]); return list; }

    int idx = searchClosestIdx(arr, x);
    System.out.println("close id" +idx);

    int i = idx;
    int j = idx;

    k--;
    
    while(k > 0) {
         if(i-1 >= 0 && j+1 < arr.length) {
             if(Math.abs(x - arr[i-1]) <= Math.abs(x - arr[j+1])) {
                 i--;
             } else {
                 j++;
             }
         } else if(i > 0) {
             i--;
         } else {
             j++;
         }
         k--;
     }
    
     for(k = i; k <= j; k++) {
         list.add(arr[k]);
     }
    
    return list;
}

public static int searchClosestIdx(int[] a, int value) {

    if(value < a[0]) {
        return a[0];
    }
    if(value > a[a.length-1]) {
        return a[a.length-1];
    }

    int lo = 0;
    int hi = a.length - 1;

    int startIndex = -1;
    
    while (lo <= hi) {
        int mid = (hi + lo) >>> 1;

        if (value < a[mid]) {
            hi = mid - 1;
        } else if (value > a[mid]) {
            lo = mid + 1;
        } else {
        // Should work for duplicates! move always while lo <= hi
            startIndex = mid;
            hi = mid - 1;
        }
    }
    
    // On the last iteration, if no equal match then low > hi = aka "Insertion position".
    return (startIndex != -1) ? startIndex : lo-1;
}
}
