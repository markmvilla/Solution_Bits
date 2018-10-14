package com.solutionbits.bits;

public class LongestPalindromicSubsequence {

	public static int run(String a, String method) {
		switch(method){
		case "recursive" : 
			return recursive(a, 0, a.length()-1);
		case "memoization" : 
			return memoization(a, 0, a.length()-1, new int[a.length()][a.length()]);
		case "tabulation" : 
			return tabulation(a);
		default:
			return -1;
		}
	}
	
	//t O(2^n) s O(1) call stack
	public static int recursive(String a, int m, int n){
		if(m == n)	return 1;
		else if(m+1==n)	return (a.charAt(m) == a.charAt(n))? 2 : 0;
		else if(a.charAt(m) == a.charAt(n))	return recursive(a, m+1, n-1) + 2;
		else	return Math.max(recursive(a, m, n-1), recursive(a, m+1, n));
	}
	
	//t O(?) s O(n^2) call stack
	public static int memoization(String a, int m, int n, int[][] memo){
		if(memo[m][n]>0)	return memo[m][n];
		if( m == n)	return 1;
		else if(m+1==n)	return (a.charAt(m) == a.charAt(n))? 2 : 0;
		else{
			if(a.charAt(m) == a.charAt(n)) {
				memo[m+1][n-1] = memoization(a, m+1, n-1, memo);
				return memo[m+1][n-1]+2;
			}else {
				memo[m+1][n] = memoization(a, m+1, n, memo);
				memo[m][n-1] = memoization(a, m, n-1, memo);
				return Math.max(memo[m+1][n], memo[m][n-1]);
			}
		}
	}
	
	//t O(n^2) s O(n^2)
	public static int tabulation(String a){
		int table[][] = new int[a.length()][a.length()];
		
		for (int offset=0; offset<a.length(); offset++) {
			for (int i=0; i<a.length()-offset; i++) {
				int j = i+offset;
				if (offset == 0) table[i][j] = 1;
				else if (offset == 1) table[i][j] = (a.charAt(i) == a.charAt(j))? 2 : 0;
				else	table[i][j] = (a.charAt(i) == a.charAt(j))? table[i+1][j-1] + 2: Math.max(table[i+1][j], table[i][j-1]);
			}
		}
		return table[0][a.length()-1];
	}
}
