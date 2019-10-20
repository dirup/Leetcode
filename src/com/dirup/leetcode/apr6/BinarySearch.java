/**
 * 
 */
package com.dirup.leetcode.apr6;

/**
 * @author dirup
 *
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,7,10,14,17,20};
		int num =17;
		int index = binarySearch(arr,0,arr.length-1,num);
		System.out.println(index);

	}

	protected static int binarySearch(int[] arr, int low, int high, int num) {
		int mid = (low + high)/2;
		while(low<=high) {
		if(arr[mid] == num)
			return mid;
		if(arr[mid] <= num)
			return binarySearch(arr, mid+1, high, num);
		else
			return binarySearch(arr, low, mid-1, num);
		}
		return -1;
	}	

}
