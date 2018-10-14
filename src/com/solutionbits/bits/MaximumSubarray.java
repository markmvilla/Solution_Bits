package com.solutionbits.bits;

public class MaximumSubarray {

	public static int run(int[] values){			
		return maxSubarray(values);
	}
	
	//t O(n) s O(1)
	public static int maxSubarray(int[] values){
		int minValue = values[0];
		int maxSub = values[1]-values[0];
		for(int i = 1; i<values.length; i++){
			maxSub = Math.max(maxSub, values[i]-minValue);
			minValue = Math.min(minValue,  values[i]);
		}
		return maxSub;
	}
	
}
