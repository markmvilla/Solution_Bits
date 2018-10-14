package com.solutionbits.bits;

public class AnagramCheck {

	public static boolean run(String s1, String s2){			
		return isAnagram(s1, s2);
	}
	
	//t O(n) s O(1)
	public static boolean isAnagram(String s1, String s2){
		int[] count= new int[128];
		
		if(s1.length() != s2.length()) return false;
		
		char[] s1char = s1.toCharArray();
		for(int i=0; i<s1.length(); i++){
			count[s1char[i]]++;
		}
		char[] s2char = s2.toCharArray();
		for(int j=0; j<s2.length(); j++){
			if(--count[s2char[j]]<0) return false;
		}
		return true;
	}
	
}
