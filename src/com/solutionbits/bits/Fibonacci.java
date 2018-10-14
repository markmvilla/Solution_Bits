package com.solutionbits.bits;

public class Fibonacci {

	public static int run(int n){			
		return fib(n);
	}
	
	//t O(n) s O(1)
	public static int fib(int n){
		if(n<=1) return n;
		int a = 1;
		int b = 1;
		for(int i=3; i<=n; i++){
			int c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
	
}
