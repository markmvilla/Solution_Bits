package com.solutionbits.bits;

public class ReverseSentence {

	public static String run(String sentence){			
		return reverseSentence(sentence);
	}
	
	//t O(n) s O(1)
	public static String reverseSentence(String sentence){
		//split is t O(n)
		String[] words = sentence.split(" ");
		for(int i=0; i < words.length/2; i++){
			String temp = words[i];
			words[i] = words[words.length-1-i];
			words[words.length-1-i] = temp;
		}
		return String.join(" ", words);
	}
	
}
