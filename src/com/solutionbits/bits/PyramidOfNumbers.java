package com.solutionbits.bits;

public class PyramidOfNumbers {

	public static String run(int n){			
		return pyramid(n);
	}
	
	//t O(n) s O(1)
	public static String pyramid(int n){
		StringBuilder pyramid = new StringBuilder("");
		for(int i=0; i<n; i++){
			for(int j=0; j<=i; j++){
				pyramid.append(((int)(Math.pow(i, 2)+i)/2+j+1)+" ");
			}
			pyramid.append("\n");
		}
		return pyramid.toString();
	}
	
}
