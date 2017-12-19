package com.nag.learn;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FIndMedian {

	public static void main(String[] args) {
		FIndMedian m = new FIndMedian();
		//System.out.println(m.findMedianSortedArrays(new int[]{}, new int[]{1,2,3,4,5}));
		double d = (double)3/2;
		System.out.println(d);
		
		System.out.println(m.findMedianForCombine(new int[]{}, new int[]{1,2}));
	}
	
	public double findMedianForCombine(int[] nums1, int[] nums2){
		int size = nums1.length + nums2.length;
		int[] newArray = new int[size];
		System.arraycopy(nums1, 0, newArray, 0, nums1.length);
		System.arraycopy(nums2, 0, newArray, nums1.length, nums2.length);
		Arrays.sort(newArray);
		return findMedian(newArray);
		
	}
	
	   public double findMedianSortedArrays(int[] nums1, int[] nums2) {

	        double numsMedian1 = findMedian(nums1);
	        double numsMedian2 = findMedian(nums2);
	        
	        if(numsMedian1>0.0 && numsMedian2>0.0){
	            return (double)(numsMedian1 +numsMedian2)/2;
	        }else{
	            if(numsMedian1>0.0){
	                return numsMedian1;
	            }else if(numsMedian2>0.0){
	                return numsMedian2;
	            }else{
	                return 0.0;
	            }
	        }
	        
	        
	        
	    }
	    public double findMedian(int[] nums){
	       if(nums.length>0){
	            if(nums.length>1){
	                if(nums.length % 2 == 0){
	                    int index = nums.length/2;
	                    return (double)(nums[index-1]+nums[index])/2;
	                }else{
	                    int index = nums.length/2;
	                    return (nums[index]);
	                }
	            }else{
	                return nums[0];
	            }
	        }else{
	           return 0.0;
	        }
	    }
}
