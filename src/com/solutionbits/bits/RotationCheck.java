package com.solutionbits.bits;

public class RotationCheck {

	public static boolean run(String s1, String s2){			
		return isRotation(s1, s2);
	}
	
	//t O(n) s O(1)
	public static boolean isRotation(String s1, String s2){
		if (s1.length() == s2.length() && s1.length() > 0){
			//t O(n)
			String twices1 = s1 + s1;
			//t O(n)
			return twices1.contains(s2);
		}
		return false;
	}
	
}
