package com.dirup.leetcode.may4;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		int[] nums = {1,3};
		int target = 1;
		int index = search(nums,target);
		System.out.println("val "+ index);
	}
		// TODO Auto-generated method stub
		
		    public static int search(int[] nums, int target) {
		        if(nums.length == 0)
		            return -1;
		         int pivot = findPivot(nums, 0,nums.length-1);
		        System.out.println("pivot" + pivot);
		        if(pivot == -1)
		           return binarySearch(nums, 0, nums.length, target);
//		        if (nums[pivot] == target) 
//		    		return pivot; 
		   // 	if (nums[0] <= target) { 
		        else if(nums[pivot] < target && nums[nums.length] > target ) {
		    		int num = binarySearch(nums, 0, pivot-1, target); 
		    		return num;
		    	}
		    	else {
		    	int val = binarySearch(nums, pivot+1, nums.length-1, target); 
		    	return val;
		    	}
		    	//} 
//		        int searchElem = searchPivot(nums, 0, nums.length-1, target, pivot);
//		       System.out.println(searchElem);
//		        
//		        return searchElem;
		    }
		    
		    public static int findPivot(int[] nums, int start,int end)
		    {
		        if(start > end){
		        	return -1;
		        }
		        if(start == end)
		        	return start;
//		            if(start == end)
//		                return start;
		       /* int mid = (start + end)/2;
		        if(nums[mid] > nums[mid+1])
		            return mid+1;
		        if(nums[start]>nums[mid])
		        {
		            return findPivot(nums,start,mid);
		        }
		        else{
		            return findPivot(nums,mid+1,end);
		        }*/
		        
		        int mid = (start + end)/2; 
		    	if (mid < end && nums[mid] > nums[mid + 1]) 
		    		return mid; 
		    	if (mid > start && nums[mid] < nums[mid - 1]) 
		    		return (mid-1); 
		    	if (nums[start] >= nums[mid]) 
		    		return findPivot(nums, start, mid-1); 
		    	return findPivot(nums, mid + 1, end); 
		    
		     //   return -1;
		    }
		    
		    /*public static int searchPivot(int[] nums, int start, int end, int target, int pivot)
		    {
		        if(pivot == -1)
		            binarySearch(nums, start, end, target);
		        if(nums[pivot] == target)
		            return pivot;
		        if (end < start){
		        	return -1;
		        }
		        
		            
		           int mid = (start + end)/2;
		            if(nums[mid] == target)
		                return mid;
		            if(nums[pivot] < target && nums[end] < target )
		                return binarySearch(nums, start, pivot, target);
		            else
		                return binarySearch(nums, pivot+1, end, target);
		        
		    }*/
		    
		    public static int binarySearch(int[] nums, int start, int end, int target)
		    {
		        if(end < start)
		        {
		        	return -1;
		        }
		        
		             // if(start == end)
		             //     return start;
		            int mid = (start + end)/2;
		            if(nums[mid] == target){
		                System.out.println("found elem at " +mid);
		                return mid;
		                
		            }
		            if(target > mid)
		            {
		                return binarySearch(nums, mid+1,end, target );
		            }
		            else{
		                return binarySearch(nums, start, mid-1, target );
		            }
		       
		    }
	

}
