package com.solutionbits.bits;

public class ParenthesesCombinations {

	public static void run(int size){		
		recursive(size, size, new char[size*2], 0);
	}
	
	//t O(2^n) s O(1) call stack
	public static void recursive(int left, int right, char[] string, int count){
		if(left<0 && right<1){
			System.out.println("wrong input");
			return;
		}
		if(left==0 && right==0){
			System.out.println(string);
		}else{
			if(left>0){
				string[count] = '(';
				recursive(left-1, right, string, count+1);
			}
			if(right>left) {
				string[count] = ')';
				recursive(left, right-1, string, count+1);
			}
		}
	}
	
}
