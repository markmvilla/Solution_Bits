package com.solutionbits.bits;

import java.util.HashSet;

public class PermutationPalindrome {

	public static boolean run(String s1){			
		return isPermPal(s1);
	}
	
	//t O(n) s O(1)
	public static boolean isPermPal(String s1){
		HashSet<Character> permSet = new HashSet<Character>();
		
		for(int i=0; i<s1.length(); i++){
			if(permSet.contains(s1.charAt(i))){
				permSet.remove(s1.charAt(i));
			}else{
				permSet.add(s1.charAt(i));
					
			}
		}
		return permSet.size() <= 1;
	}
	
}
