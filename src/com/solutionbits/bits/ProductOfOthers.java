package com.solutionbits.bits;

public class ProductOfOthers {

	public static int[] run(int[] values){
		return tabulation(values);
	}
	
	//t O(n) s O(n)
	public static int[] tabulation(int[] values){
		int[] products = new int[values.length];
		
		int temp = 1;
		for(int i=0; i<values.length; i++){
			products[i] = temp;
			temp *= values[i];
		}
		
		temp = 1;
		for(int j=values.length-1; j>=0; j--){
			products[j] *=temp;
			temp *= values[j];
		}
		
		return products;
	}
	
}
