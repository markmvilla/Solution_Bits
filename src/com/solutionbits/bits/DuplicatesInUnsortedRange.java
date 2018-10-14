package com.solutionbits.bits;

public class DuplicatesInUnsortedRange {

	public static int run(int[]  nums){			
		return findDuplicate(nums);
	}
	
	//t O(n) s O(1)
	//in-place algorithm so be careful
	public static int findDuplicate(int[] nums){
		boolean zeroCount = false;
		
		for(int i=0; i<nums.length; i++){
			if(nums[Math.abs(nums[i])]>0){
				nums[Math.abs(nums[i])] *= -1;
			}else if(nums[Math.abs(nums[i])] == 0){
				if(!zeroCount) {
					zeroCount = true;
				}else {
					return Math.abs(nums[i]);
				}
			}else{
				return Math.abs(nums[i]);
			}
		}
		
		return -1;
	}
	
}
