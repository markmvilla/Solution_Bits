package com.solutionbits.bits;

public class DuplicateInUnsortedRange {

	public static int run(int[]  nums){			
		return findDuplicate(nums);
	}
	
	//t O(n) s O(1)
	public static int findDuplicate(int[] nums){
		//minus one because nums contains a duplicate
		int length = nums.length-1;
		int calculatedSum = (int)(Math.pow(length, 2) + length)/2;
		int actualSum = 0;
		for(int i = 0; i < nums.length; i++){
			actualSum += nums[i];
		}
		return actualSum - calculatedSum;
	}
}
