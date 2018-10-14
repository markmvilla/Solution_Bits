package com.solutionbits.bits;

public class WordsRotationPoint {

	public static int run(String[] words){			
		return rotationPoint(words);
	}
	
	//t O(nlog n) s O(1) .compareTo is most likely linear in time complexity
	public static int rotationPoint(String[] words){
		int floor = 0;
		int ceiling = words.length;
		int guessIndex = 0;
		String guessValue;
		
		while(ceiling - floor > 1){
			guessIndex = floor + (ceiling - floor)/2;
			guessValue = words[guessIndex];
			if(words[floor].compareTo(guessValue)>0){
				ceiling = guessIndex;
			}else if(guessValue.compareTo(words[ceiling])>0){
				floor = guessIndex;
			}
		}
		return guessIndex;
	}
	
}
