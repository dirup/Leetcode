/**
 * 
 */
package com.dirup.leetcode.apr6;

/**
 * @author dirup
 *Consider an array of distinct numbers sorted in increasing order. The array has been rotated (clockwise)
 * k number of times. Given such an array, find the value of k.
 */
public class ArrayRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {15, 18, 19, 3, 6, 12};
		int num = 6;
		int pivot = (countRotations(arr, 0, arr.length-1));
		System.out.println(pivot);
		BinarySearch bs =new BinarySearch();
		int val;
		if(num>arr[pivot] && num > arr[arr.length-1])
			val = bs.binarySearch(arr,0,pivot-1,num);
		else
			val = bs.binarySearch(arr,pivot+1,arr.length+1,num);
		System.out.println(val);
			
	}

	private static int countRotations(int[] arr, int low, int high) {
		int mid = (low + high)/2;
		if(low == high)
			return low;
	//	while(low <= high) {
			if(mid < high && arr[mid+1] < arr[mid])
				return mid+1;
			if(mid > low && arr[mid-1]>arr[mid])
				return mid;
			if(arr[mid] > arr[high])
				return countRotations(arr,mid+1,high);
			else
				return countRotations(arr,low,mid-1);
	//	}
	//	return -1;
		
	}

}
