package com.solutionbits.bits;

import java.util.Arrays;
import com.solutionbits.bits.util.Items.Coin;

public class WaysToMakeChange {

	public static int run(Coin[] coins, int change, String method){
		switch(method){
		case "recursive" : 
			return recursive(coins, 0, change);

		case "memoization" : 
			int[][] memo = new int[coins.length+1][change+1];
			for (int[] row: memo)
			    Arrays.fill(row, -1);
			return memoization(coins, 0, change, memo);
			
		case "tabulation" : 
			return tabulation(coins, change);
			
		default:
			return -1;
		}
	}
	
	//t O(2^change) s O(1) call stack
	public static int recursive(Coin[] coins, int coinPointer, int change){	
		if(change < 0 || coinPointer == coins.length)	return 0;
		if(change == 0)	return 1;
		return recursive(coins, coinPointer, change-coins[coinPointer].value) + recursive(coins, coinPointer+1, change);
	}
	
	//t O(?) s O(coins.length*change) call stack
	public static int memoization(Coin[] coins, int coinPointer, int change, int[][] memo){
		
		if(memo[coinPointer][change] >= 0)	return memo[coinPointer][change];

		if(change == 0)	return 1;
		if(coinPointer == coins.length)	return 0;
		if(change-coins[coinPointer].denomination < 0) {
			memo[coinPointer][change] = memoization(coins, coinPointer+1, change, memo);
			return memo[coinPointer][change];
		}
		
		memo[coinPointer][change] = memoization(coins, coinPointer, change-coins[coinPointer].denomination, memo) + memoization(coins, coinPointer+1, change, memo);
		return memo[coinPointer][change];
	}
	
	//t O(coins.lenght*change) s O(change)
	public static int tabulation(Coin[] coins, int change){
		int[] table = new int[change+1];
		
		table[0] = 1;
		for(int i=0; i<coins.length; i++){
			for(int j=coins[i].denomination; j<=change; j++){
				table[j] += table[j-coins[i].denomination];
			}
		}
		return table[change];
	}
	
}
