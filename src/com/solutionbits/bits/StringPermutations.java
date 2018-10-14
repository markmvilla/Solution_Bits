package com.solutionbits.bits;

public class StringPermutations {

	public static void run(String original){		
		recursive(original, new String(""));
	}
	
	//t O(word.length^word.length+1) s O(change) call stack
	public static void recursive(String original, String permutation){
		if(original.length()==0){
			System.out.println(permutation);
		}else{
			for(int i=0; i<original.length(); i++){
				//substring and concatenation are linear so O(n) + O(n) + O(n) = O(n)
				recursive(original.substring(0,i) + original.substring(i+1), permutation + original.charAt(i));
			}
		}
	}
	
}
