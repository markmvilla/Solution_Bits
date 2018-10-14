package com.solutionbits.bits.goldmansachs;

//similar to "ways to make change" and similarly hard to implement memoization
public class WaysToSum {

	public static int run(int number){
		return recursive(number, number);
	}
	
	public static int recursive(int number, int level) {
		if(number < 0)	return 0;
		else if(number == 0)	return 1;
		else if(level <=0 )		return 0;
		else	return recursive(number, level-1) + recursive(number-level, level);
	}
	
	/*
	public static int memoization(int number, int level, int[][] memo) {
		
	}
	*/
	
}
