package com.solutionbits.bits;

import java.util.Arrays;
import com.solutionbits.bits.util.Items.Coin;

public class MinimumChange {
	
	public static int run(Coin[] coins, int change, String method){
		switch(method){
		case "tabulation" : 
			return tabulation(coins, change);
		
		default:
			return -1;
		}
	}
	
	//t O(coins*change) s O(change) call stack
	public static int tabulation(Coin[] coins, int change){
		int[] minCoinsAtLength = new int[change+1];
		Arrays.fill(minCoinsAtLength, Integer.MAX_VALUE);
		minCoinsAtLength[0] = 0;
		for(int currentChange=1; currentChange <= change; currentChange++){
			for(Coin coin: coins) {
				if(coin.denomination <= currentChange) {
					int currentMin = 1 + minCoinsAtLength[currentChange - coin.denomination]; 
	                if (currentMin != Integer.MAX_VALUE+1) 
	                	minCoinsAtLength[currentChange] = Math.min(minCoinsAtLength[currentChange], currentMin);
				}
			}
		}
		return minCoinsAtLength[change];
	}
	
}
