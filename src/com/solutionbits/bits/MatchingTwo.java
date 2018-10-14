package com.solutionbits.bits;

import java.util.HashSet;

public class MatchingTwo {

	public static boolean run(int flightLength,int[] movies){			
		return isAvailable(flightLength, movies);
	}
	
	//t O(n) s O(n)
	public static boolean isAvailable(int flightLength, int[] movies){
		HashSet<Integer> sums = new HashSet<Integer>();
		for(Integer movieLength: movies){
			if(sums.contains(movieLength)) return true;
			sums.add(flightLength - movieLength);
		}
		return false;
	}
	
}
