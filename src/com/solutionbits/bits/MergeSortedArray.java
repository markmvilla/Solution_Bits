package com.solutionbits.bits;

public class MergeSortedArray {

	public static int[] run(int[] arr1, int[] arr2){			
		return sort(arr1, arr2);
	}
	
	//t O(n) s O(1) or O(max)
	public static int[] sort(int[] arr1, int[] arr2){
		int arr1Count = 0;
		int arr2Count = 0;
		
		int[] merge = new int[arr1.length+arr2.length];
		
		for(int i=0; i<merge.length; i++){
			if(arr1Count<arr1.length && arr2Count<arr2.length){
				if(arr1[arr1Count] >= arr2[arr2Count]){
					merge[i] = arr2[arr2Count];
					arr2Count++;
				}else if(arr1[arr1Count] < arr2[arr2Count]){
					merge[i] = arr1[arr1Count];
					arr1Count++;
				}
			}else if(arr1Count >= arr1.length){
				merge[i] = arr2[arr2Count];
				arr2Count++;
			}else if(arr2Count >= arr2.length){
				merge[i] = arr1[arr1Count];
				arr1Count++;
			}
		}
		return merge;
	}
	
}
