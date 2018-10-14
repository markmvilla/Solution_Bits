package com.solutionbits.bits;

public class BinarySearch {

	public static int run(int target, int[] array){			
		return search(target, array);
	}
	
	//t O(log n) s O(1)
	public static int search(int target, int[] array){
		int floor = -1;
		int ceiling = array.length;
		while(ceiling-floor>1){
			int guessIndex = floor + (ceiling-floor)/2;
			int guessValue = array[guessIndex];
			if(guessValue == target){
				return guessIndex;
			}
			else if(guessValue > target){
				ceiling = guessIndex;
			}
			else{
				floor = guessIndex;
			}
		}
		return -1;
	}
	
}
