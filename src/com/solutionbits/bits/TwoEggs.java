package com.solutionbits.bits;

public class TwoEggs {

	public static int run(int floors){			
		return firstStep(floors);
	}
	
	//t O(1) s O(1)
	public static int firstStep(int floors){
		return (int)Math.ceil(-.5+Math.pow(1+8*floors, .5)/2);
	}
	
}
