package com.solutionbits.bits;

public class ActivitySelection {

	public static int run(int[] start, int[] finish){			
		return activitySelection(start, finish);
	}
	
	//t O(n) s O(1)
	public static int activitySelection(int[] start, int[] finish){
		int numberOfActivities = start.length;
		int maxActivityCount = 1;
		int i = 0;
		for(int j = 1; j<numberOfActivities; j++){
			if(start[j] >= finish[i]){
				i = j;
				maxActivityCount++;
			}
		}
		return maxActivityCount;
	}
	
}
