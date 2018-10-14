package com.solutionbits.bits;

public class ParenthesesMatching {

	public static int run(String str, int parenthesesIndex){			
		return parenthesesMatching(str, parenthesesIndex);
	}
	
	//t O(n) s O(1)
	public static int parenthesesMatching(String str, int parenthesesIndex){
		int count = 1;
		while(count != 0){
			parenthesesIndex++;
			if(str.charAt(parenthesesIndex) == '('){
				count++;
			}else if(str.charAt(parenthesesIndex) == ')'){
				count--;
			}
		}
		return parenthesesIndex;
	}
	
}
