package com.solutionbits.bits;

public class AllSubstrings {

	public static String run(String word){			
		return substrings(word);
	}
	
	//t O(n^2*n/2) s O(2^n)
	public static String substrings(String word){
		StringBuilder substrings = new StringBuilder("");
		
		for(int i=0; i<word.length(); i++){
			for(int j=i+1; j<=word.length(); j++){
				//append is O(1)
				//substring is O(substring) starting with Java 1.7 
				//since characters are copied over to a new String
				//substring is roughly n/2 for this algorithm
				substrings.append(word.substring(i,j) + "\n");
			}
		}
		return substrings.toString();
	}
	
}
