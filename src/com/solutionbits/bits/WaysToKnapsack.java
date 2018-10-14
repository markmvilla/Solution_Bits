package com.solutionbits.bits;

import java.util.Arrays;
import com.solutionbits.bits.util.Items.ItemType;

public class WaysToKnapsack {

	public static int run(ItemType[] itemTypes, int capacity, String method){
		switch(method){
		case "recursive" : 
			return recursive(itemTypes, 0, capacity);
		
		case "memoization" : 
			int[][] memo = new int[itemTypes.length+1][capacity+1];
			for (int[] row: memo)
			    Arrays.fill(row, -1);
			return memoization(itemTypes, 0, capacity, memo);
			
		default:
			return -1;
		}
	}
	
	//t O(2^capacity) s O(1) call stack
	public static int recursive(ItemType[] itemTypes, int itemTypePointer, int capacity){
		if(capacity < 0)return 0;
		if(capacity == 0 || itemTypePointer == itemTypes.length)return 1;
		return recursive(itemTypes, itemTypePointer, capacity-itemTypes[itemTypePointer].weight) + recursive(itemTypes, itemTypePointer+1, capacity);
	}
	
	//t O(?) s O(itemType.length*capacity) call stack
	public static int memoization(ItemType[] itemTypes, int itemTypePointer, int capacity, int[][] memo){
		if(memo[itemTypePointer][capacity] >= 0)return memo[itemTypePointer][capacity];
		
		if(capacity == 0 || itemTypePointer == itemTypes.length)return 1;
		if(capacity-itemTypes[itemTypePointer].weight < 0) {
			memo[itemTypePointer][capacity] = memoization(itemTypes, itemTypePointer+1, capacity, memo);
			return memo[itemTypePointer][capacity];
		}
		
		memo[itemTypePointer][capacity] = memoization(itemTypes, itemTypePointer, capacity-itemTypes[itemTypePointer].weight, memo) + memoization(itemTypes, itemTypePointer+1, capacity, memo);
		return memo[itemTypePointer][capacity];
	}

}
