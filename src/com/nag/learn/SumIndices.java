package com.nag.learn;

import java.util.HashMap;

public class SumIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SumIndices().twoSums(new int[]{2, 3,4},8);
		int[] result = new SumIndices().twoSums1(new int[]{2, 3,4},7);
		
		System.out.println(result[0]+", "+result[1]);
	}
	
	public  int[] twoSums(int[] nums, int target){
		boolean flag=true;
		if(nums.length>0){
			for(int i=0;i<=nums.length;i++){
				for(int j= i+1; j<=nums.length-1;j++){
					if(nums[i]+nums[j]==target){
						flag=false;
						System.out.println("the sum of these two elements is equal to target:: "+i+", "+j);
					}
				}
			}
		}else{
			System.out.println("there are no elements in the array. Please try again");
		}
		if(flag){
			System.out.println("there is no sum of two elements is equal to target");
		}
		
		return new int[]{};
	}
	
	public  int[] twoSums1(int[] nums, int target){
		if(nums.length>0){
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for(int i=0;i<nums.length;i++){
				int result = target - nums[i];
				if(map.containsKey(result)){
					return new int[]{map.get(result),i};
				}
				map.put(nums[i], i);
			}
		}else{
			System.out.println("there are no elements in the array. Please try again");
		}
		
	 throw  new IllegalArgumentException("there is no sum of two elements is equal to target");
	}
}
