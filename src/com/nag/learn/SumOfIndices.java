package com.nag.learn;

public class SumOfIndices {
    public int[] twoSum(int[] nums, int target) {
       if(nums.length >0){
            int sum =nums[0]; 
            int count =1 ;
            boolean isSumsEqual = false;
            for(int i=1;i<nums.length;i++){
                sum = sum +nums[i];
                if(sum==target){
                	isSumsEqual = true;
                	count = i;
                	break;
                }
            }
            if(isSumsEqual){
            	int[] indices = new int[count+1];
            	for(int i=0;i<=count;i++){
            		indices[i]=i;
            	}
            	return indices;
            }else{
            	System.out.println("The target is not exactly equals to the sum of the numbrs in the array");
            	System.exit(0);
            }
        
        }else{
        	System.out.println("the array has no elements");
        }
       
       return nums;
    }
    
    public static void main(String[] args) {
    	SumOfIndices ss = new SumOfIndices();
    	int[] result = ss.twoSum(new int[]{0,1,2,3,4,5,6,7,8,9}, 12);
    	for(int i=0;i<=result.length;i++){
    		System.out.print(i+",");
    	}
	}
}