package com.solutionbits.bits.goldmansachs;

import java.util.ArrayList;

public class AllSeqOfSums {

	public static int run(int number){
		return recursive(number, number, new ArrayList<Integer>());
	}
	
	public static int recursive(int number, int level, ArrayList<Integer> trace) {
		if(number < 0)	return 0;
		else if(number == 0) {
			System.out.println(trace);
			return 1;
		}
		else if(level <=0 )	return 0;
		else {
			int second = recursive(number, level-1, new ArrayList<Integer>(trace));
			trace.add(level);
			int first = recursive(number-level, level, trace);
			return first + second;
		}
	}
	
}
