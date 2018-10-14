package com.solutionbits.bits;

public class HighestProductOfTriplet {

	public static int run(int[]  nums){			
		return highestTriplet(nums);
	}
	
	//t O(n) s O(1)
	public static int highestTriplet(int[] nums){
		int[] maxThree = new int[3];
		int[] minTwo = new int[2];
		for(int i=0; i<nums.length; i++){
			if(nums[i] > maxThree[0]){
				maxThree[2] = maxThree[1];
				maxThree[1] = maxThree[0];
				maxThree[0] = nums[i];
			}
			else if(nums[i] > maxThree[1]){
				maxThree[2] = maxThree[1];
				maxThree[1] = nums[i];
			}else if(nums[i] > maxThree[2]){
				maxThree[2] = nums[i];
			}
			if(nums[i] < minTwo[0]){
				minTwo[1] = minTwo[0];
				minTwo[0] = nums[i];
			}else if(nums[i] < minTwo[1]){
				minTwo[1] = nums[i];
			}
		}
		return Math.max(maxThree[0]*maxThree[1]*maxThree[2], maxThree[0]*minTwo[0]*minTwo[1]);
	}
}
