package com.solutionbits.bits.goldmansachs;

public class Rand5 {

	public static int run(){			
		return rand5Using7();
	}
	
	static int rand5Using7() {
		while (true) {
			int rolls = 5*rand5() + rand5()-5;
			if(rolls > 21)
				continue;
			return rolls%7+1;
		}
	}
	
	
	static int rand5() {
		return randomGenRange(1, 5);
	}
	
	static int randomGenRange(int min, int max) {
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
	
}
