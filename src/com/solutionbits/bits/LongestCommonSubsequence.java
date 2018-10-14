package com.solutionbits.bits;

public class LongestCommonSubsequence {

	public static int run(String a, String b, String method){
		switch(method){
		case "recursive" : 
			return recursive(a, b, a.length(), b.length());
		case "memoization" : 
			return memoization(a, b, a.length(), b.length(), new int[a.length()+1][b.length()+1]);
		case "tabulation" : 
			return tabulation(a, b);
		default:
			return -1;
		}
	}
	
	//t O(2^n) s O(1) call stack
	public static int recursive(String a, String b, int m, int n){
		if (m == 0 || n == 0)	return 0;
		if (a.charAt(m-1) == b.charAt(n-1))	return recursive(a, b, m-1, n-1) + 1;
		else	return Math.max(recursive(a, b, m, n-1), recursive(a, b, m-1, n));
		
	}
	
	//t O(?) s O(mn) call stack
	public static int memoization(String a, String b, int m, int n, int[][] memo){
		if(memo[m][n] > 0) return memo[m][n];
		
		if (m == 0 || n == 0)	return 0;
		if (a.charAt(m-1) == b.charAt(n-1)){
			memo[m-1][n-1] = memoization(a, b, m-1, n-1, memo) + 1;
			return memo[m-1][n-1];
		}else{
			memo[m][n-1] = memoization(a, b, m, n-1, memo);
			memo[m-1][n] = memoization(a, b, m-1, n, memo);
			return Math.max(memo[m][n-1], memo[m-1][n]);
		}
	}
	
	//t O(mn) s O(mn)
	public static int tabulation(String a, String b){
		int[][] table = new int[a.length()+1][b.length()+1];
		
		for(int i = 0; i <= a.length(); i++){
			for(int j = 0; j <= b.length(); j++){
				if(i==0 || j==0)	table[i][j] = 0;
				else	table[i][j] = (a.charAt(i-1) == b.charAt(j-1))? table[i-1][j-1] + 1 : Math.max(table[i-1][j], table[i][j-1]);
			}
		}
		return table[a.length()][b.length()];
	}
	
}
