package com.solutionbits.bits;

public class LongestPalindromicSubstring {

	public static int run(String a){		
		return tabulation(a);
	}
	
	//t O(n^2) s O(n^2)
	public static int tabulation(String a){
		int table[][] = new int[a.length()][a.length()];
		int max = Integer.MIN_VALUE;

		for (int offset=0; offset<a.length(); offset++) {
			for (int i=0; i<a.length()-offset; i++) {
				int j = i+offset;
				if (offset == 0) table[i][j] = 1;
				else if (offset == 1) table[i][j] = (a.charAt(i) == a.charAt(j))? 2 : 1;
				else table[i][j] = (a.charAt(i) == a.charAt(j))? table[i+1][j-1] + 2: 0;
				max = Math.max(max, table[i][j]);
			}
		}		
		return max;
	}
}
