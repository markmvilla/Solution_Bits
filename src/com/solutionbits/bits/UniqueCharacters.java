package com.solutionbits.bits;

public class UniqueCharacters {

	public static boolean run(String str){			
		return isUniqueChar(str);
	}
	
	//t O(n) s O(1)
	public static boolean isUniqueChar(String str){
		boolean[] set = new boolean[256];
		
		for (int i=0; i<str.length(); i++){
			int value = str.charAt(i) - 'a';
			if(set[value]) return false;
			set[value] = true;
		}
		
		return true;
	}
	
}
