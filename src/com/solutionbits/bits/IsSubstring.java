package com.solutionbits.bits;

public class IsSubstring {

	public static boolean run(String a, String b){			
		return isSubstring(a, b);
	}
	
	//t O(n) s O(1)
	//check complexities
	public static boolean isSubstring(String a, String b){
		if(b.length() > a.length()){
			return b.contains(a);
		}
		return a.contains(b);
	}
	
}
