package com.solutionbits.bits;

import java.util.Arrays;

public class WaysToCoverSteps {

	public static int run(int steps, String method){
		switch(method){
		case "recursive" : 
			return recursive(steps);
		case "memoization" : 
			int[] memo = new int[steps+1];
			Arrays.fill(memo, -1);
			return memoization(steps, memo);
		case "tabulation" : 
			return tabulation(steps);
		default:
			return -1;
		}
	}
	
	//t O(3^n) s O(1) call stack
	public static int recursive(int steps){
		if(steps<0) return 0;
		else if(steps ==0) return 1;
		else 
			return recursive(steps-1) + recursive(steps-2) + recursive(steps-3);
	}
	
	//t O(?) s O(steps) call stack
	public static int memoization(int steps, int[] memo){
		if(steps<0) return 0;
		else if(steps ==0) return 1;
		else if(memo[steps]>-1) return memo[steps];
		else{
			memo[steps] = memoization(steps-1, memo) + memoization(steps-2, memo) + memoization(steps-3, memo);
			return memo[steps];
		}
	}
	
	//t O(steps) s O(steps)
	public static int tabulation(int steps){
		int[] table = new int[steps+1];
		table[0] = 1;
		table[1] = 1;
		table[2] = 2;
		
		for(int i=3; i<=steps; i++){
			table[i] = table[i-1]+table[i-2]+table[i-3];
		}
		return table[steps];
	}
	
}
