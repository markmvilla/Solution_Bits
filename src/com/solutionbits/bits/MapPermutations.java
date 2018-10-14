package com.solutionbits.bits;

public class MapPermutations {

	public static int run(boolean[][] map, String method){	
		switch(method){
		case "recursive" : 
			return recursive(map, 0, 0);
		case "memoization" : 
			return memoization(map, 0, 0, new int[map.length][map[0].length]);
		default:
			return -1;
		}
	}
	
	//t O(2^max(map.length, map.width)) s O(1) call stack
	public static int recursive(boolean[][] map, int row, int column){
		if(!isValidSquare(map, row, column)) return 0;
		if(isAtEnd(map, row, column)) return 1;
		return recursive(map, row+1, column) + recursive(map, row, column+1);
	}
	
	//t O(map.length*map.width) s O(map.length*map.width) call stack
	public static int memoization(boolean[][] map, int row, int column, int[][] paths){
		if(!isValidSquare(map, row, column)) return 0;
		if(isAtEnd(map, row, column)) return 1;
		if(paths[row][column] == 0){
			paths[row][column] = memoization(map, row+1, column, paths) + memoization(map, row, column+1, paths);
		}
		return paths[row][column];
	}
	
	public static boolean isValidSquare(boolean[][] map, int row, int column){
		return !map[row][column];
	}
	
	public static boolean isAtEnd(boolean[][] map, int row, int column){
		return ((row == map.length-1) || (column == map[0].length-1)) ;
	}
	
}
