package com.solutionbits.bits;

public class ReverseString {

	public static String run(String sentence){			
		return reverseSentence(sentence);
	}
	
	//t O(n) s O(1)
	public static String reverseSentence(String str){
		//linear copy of char so t O(n)
		char[] chars = str.toCharArray();
		for(int i=0; i<chars.length/2; i++){
			char temp = chars[i];
			chars[i] = chars[chars.length-i-1];
			chars[chars.length-i-1] = temp;
		}
		return  new String(chars);
	}
	
}
