/* 
Your previous Plain Text content is preserved below:

/* Problem Name is &&& Longest Uniform Substring &&& PLEASE DO NOT REMOVE THIS LINE. */

/**
 * Instructions to candidate.
 *  1) Run this code in the REPL to observe its behaviour. The
 *     execution entry point is main().
 *  2) Your task is to implement the following method ('longestUniformSubstring') 
 *  
 *  This method should return an integer array with two elements that correctly identifies the location of the longest 
 *  uniform substring within the input string. The first element of the array should be the starting index of the longest 
 *  substring and the second element should be the length.
 *  
 *  e.g.
 *      
 *      for the input: "abbbccda" the longest uniform substring is "bbb" (which starts at index 1 and is 3 characters long).
 *
 *  3) If time permits, add some additional test cases.
 */

package com.solutionbits.bits.goldmansachs;

import java.util.*;

public class InterviewQuestions {

  private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

  static int[] longestUniformSubstring(String input){
    int longestStart = -1;
    int longestLength = 0;
    int cur_count = 1;
    // todo: implement the longestUniformSubstring logic
    for (int i=0; i<input.length(); i++){
        if (i < input.length()-1 && input.charAt(i) == input.charAt(i+1))
            cur_count++;
        else{
            if (cur_count > longestLength){
                longestStart = i-cur_count+1;
                longestLength = cur_count;
            }
            cur_count = 1;
        }
    }
    return new int[]{ longestStart, longestLength };
  }

  public static void main(String[] args) {
    testCases.put("", new int[]{-1, 0});
    testCases.put("10000111", new int[]{1, 4});
    testCases.put("aabbbbbCdAA", new int[]{2, 5});
    //testCases.put("aa", new int[]{0, 2});

    // todo: implement more tests, please
    // feel free to make testing more elegant

    boolean pass = true;
    for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
      int[] result = longestUniformSubstring(testCase.getKey());
      pass = pass && (Arrays.equals(result, testCase.getValue()));
    }
    if(pass){
      System.out.println("All tests pass!");
    } else {
      System.out.println("At least one failure! :( ");
    }
  }
  
}