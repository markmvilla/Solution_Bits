package com.solutionbits.bits;

import java.util.Arrays;

public class LevenshteinDistance {

	public static int run(String a, String b, String method){
		switch(method){
		case "recursive" : 
			return recursive(a, b, a.length()-1, b.length()-1);
		case "memoization" : 
			int[][] memo = new int[a.length()][b.length()];
			for (int[] row: memo)
			    Arrays.fill(row, -1);
			return memoization(a, b, a.length()-1, b.length()-1, memo);
		case "tabulation" : 
			return tabulation(a, b, a.length(), b.length());
		default:
			return -1;
		}
	}
	
	//t 0(3^n) s O() call stack
	public static int recursive(String a, String b, int m, int n){
		if(m == 0) return n;
		if(n == 0) return m;
		
		if(a.charAt(m) == b.charAt(n)) {
			return recursive(a, b, m-1, n-1);
		}else{
			int replace = recursive(a, b, m-1, n-1) + 1;
			int delete = recursive(a, b, m-1, n) + 1;
			int insert = recursive(a, b, m, n-1) + 1;
			return min(replace, delete, insert);
		}
	}
	
	//t 0(?) s O(mn)
	public static int memoization(String a, String b, int m, int n, int[][] memo){
		if(memo[m][n] >= 0) return memo[m][n];
		
		if(m == 0) return n;
		if(n == 0) return m;
		
		if(a.charAt(m) == b.charAt(n)) {
			return memoization(a, b, m-1, n-1, memo);
		}else{
			memo[m-1][n-1] = memoization(a, b, m-1, n-1, memo);//replace
			memo[m-1][n] = memoization(a, b, m-1, n, memo);//delete
			memo[m][n-1] = memoization(a, b, m, n-1, memo);//insert
			return min(memo[m-1][n-1], memo[m-1][n], memo[m][n-1]) + 1;
		}
	}
	
	//t 0(mn) s O(mn)
	public static int tabulation(String a, String b, int m, int n){
		int[][] table = new int[a.length() + 1][b.length() + 1];
		 
	    for (int i = 0; i<=m; i++) {
	        for (int j = 0; j<=n; j++) {
	            if (i == 0) table[i][j] = j;
	            else if (j == 0) table[i][j] = i;
	            else if(a.charAt(i-1) == b.charAt(j-1)){
	            	table[i][j] = table[i-1][j-1];
	            }else{
	                table[i][j] = min(table[i-1][j-1], table[i-1][j], table[i][j-1]) + 1;
	            }
	        }
	    }
	    
		return table[m][n];
	}
	
	public static int min(int ... numbers) {
		int result = Integer.MAX_VALUE;
		for (int each: numbers){
			result = Math.min(result, each);
		}
		return result;
	}
}
