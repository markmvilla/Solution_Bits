package com.solutionbits.bits.goldmansachs;

public class Rand7 {

	public static int run(){			
		return rand5Using7();
	}
	
	static int rand5Using7() {
		while (true) {
			int rolls = rand7();
			if(rolls > 5)
				continue;
			return rolls;
		}
	}
	
	
	static int rand7() {
		return randomGenRange(1, 7);
	}
	
	static int randomGenRange(int min, int max) {
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
	
}
