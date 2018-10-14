package com.solutionbits.bits;

import java.util.Arrays;
import com.solutionbits.bits.util.Items.ItemType;

public class MaximumKnapsack {
	
	public static int run(ItemType[] itemTypes, int capacity, String method){
		switch(method){
		case "recursive" : 
			return recursive(itemTypes, 0, capacity);

		case "memoization" : 
			int[][] memo = new int[itemTypes.length+1][capacity+1];
			for (int[] row: memo)
			    Arrays.fill(row, -1);
			return memoization(itemTypes, 0, capacity, memo);
			
		case "tabulation" : 
			return tabulation(itemTypes, capacity);

		default:
			return -1;
		}
	}
	
	//t O(2^capacity) s O(1) call stack
	public static int recursive(ItemType[] itemTypes, int itemTypePointer, int capacity){	
		if(capacity == 0 || itemTypePointer == itemTypes.length)	return 0;
		if(capacity-itemTypes[itemTypePointer].weight < 0)
			return recursive(itemTypes, itemTypePointer+1, capacity);
		return Math.max(recursive(itemTypes, itemTypePointer, capacity-itemTypes[itemTypePointer].weight) + itemTypes[itemTypePointer].value, recursive(itemTypes, itemTypePointer+1, capacity));
	}
	
	//t O(?) s O(itemTypePointer*capacity) call stack
	public static int memoization(ItemType[] itemTypes, int itemTypePointer, int capacity, int[][]memo){
		if(memo[itemTypePointer][capacity] >= 0) return memo[itemTypePointer][capacity];
		
		if(capacity == 0 || itemTypePointer == itemTypes.length)	return 0;
		if(capacity-itemTypes[itemTypePointer].weight < 0) {
			memo[itemTypePointer][capacity] = memoization(itemTypes, itemTypePointer+1, capacity, memo);
			return memo[itemTypePointer][capacity];
		}
		memo[itemTypePointer][capacity] = Math.max(memoization(itemTypes, itemTypePointer, capacity-itemTypes[itemTypePointer].weight, memo) + itemTypes[itemTypePointer].value, memoization(itemTypes, itemTypePointer+1, capacity, memo));
		return memo[itemTypePointer][capacity];
	}
	
	//t O(itemTypes*capacity) s O(capacity) call stack
	public static int tabulation(ItemType[] itemTypes, int capacity){
		int[] maxValuesAtCapacities = new int[capacity + 1];
		for(int currentCapacity = 0; currentCapacity <= capacity; currentCapacity++){
			for(ItemType itemType : itemTypes){
				if(itemType.weight <= currentCapacity){
					int valueUsingItem = itemType.value + maxValuesAtCapacities[currentCapacity - itemType.weight];
					maxValuesAtCapacities[currentCapacity] = Math.max(maxValuesAtCapacities[currentCapacity], valueUsingItem);
				}
			}
		}
		return maxValuesAtCapacities[capacity];
	}
	
	public static class InfinityException extends RuntimeException {
		public InfinityException(){
			super("Max value is infinity!");
		}
	}
}
