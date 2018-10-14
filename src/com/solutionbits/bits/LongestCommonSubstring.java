package com.solutionbits.bits;

public class LongestCommonSubstring{
	
	public static int run(String a, String b){
		return tabulation(a, b);
	}

	//t O(mn) s O(mn)
	public static int tabulation(String a, String b){
		int[][] table = new int[a.length()+1][b.length()+1];
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i <= a.length(); i++){
			for(int j = 0; j <= b.length(); j++){
				if(i==0 || j==0)	table[i][j] = 0;
				else	table[i][j] = (a.charAt(i-1) == b.charAt(j-1))? (table[i-1][j-1] + 1) : 0;
				max = Math.max(max, table[i][j]);
			}
		}
		return max;
	}

}
