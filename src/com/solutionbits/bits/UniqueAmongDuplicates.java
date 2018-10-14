package com.solutionbits.bits;

public class UniqueAmongDuplicates {

	public static int run(int[] nums){			
		return singleAmongDuplicate(nums);
	}
	
	//t O(n) s O(1)
	public static int singleAmongDuplicate(int[] nums){
		int xor = 0;
		for(int i = 0; i<nums.length; i++){
			xor ^= nums[i];
		}
		return xor;
	}
	
}
