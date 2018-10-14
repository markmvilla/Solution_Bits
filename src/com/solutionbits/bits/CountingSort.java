package com.solutionbits.bits;

public class CountingSort {

	public static int[] run(int[] values, int max){			
		return sort(values, max);
	}
	
	//t O(n) s O(1) or O(max)
	//conditions: 1) start at or near 0 2) helpful to must know max
	//we can update to incorporate a min value as well
	public static int[] sort(int[] values, int max){
		int[] sort = new int[max+1];
		int[] out = new int[values.length];
		int index = 0;
		
		for(int i=0; i<values.length; i++){
			sort[values[i]]++;
		}
		for(int i=0; i<sort.length; i++){
			while(sort[i] !=0){
				out[index]=i;
				index++;
				sort[i] = sort[i] - 1;
			}
		}
		
		return out;
	}
	
}
