package com.solutionbits.core;

import com.solutionbits.bits.*;
import com.solutionbits.bits.util.Items.ItemType;
import com.solutionbits.bits.util.Items.Coin;
import com.solutionbits.bits.util.Items.Rod;
import com.solutionbits.bits.goldmansachs.*;

import java.util.Arrays;

public class Executor {

	public static void main(String[] args){
		long startTime = System.currentTimeMillis();

		//int run = UniqueAmongDuplicates.run(new int[] {2,3,4,5,7,8,6,4,3,2,5,7,8});
		//int run = ActivitySelection.run(new int[] {1,2,3,4,5,6,7}, new int[] {2,3,4,5,6,7,8});
		//int run = MaximumSubarray.run(new int[] {20,4,15,9});
		//int run = DuplicateInUnsortedRange.run(new int[] {1,2,3,3,4,5,6,7});
		//int run = DuplicatesInUnsortedRange.run(new int[] {0,1,2,2,3,4,5,6,7});
		//int run = HighestProductOfTriplet.run(new int[] {-10,-15,1,2,2,3,4,5,6,7});
		//boolean run = MatchingTwo.run(100, new int[] {34,75,48,51,25});
		//int run = ParenthesesMatching.run("hello(()()world)", 6);
		//String run = PyramidOfNumbers.run(6);
		//int run = TwoEggs.run(100);
		//int run = BinarySearch.run(135, new int[] {6,8,8,89,135,680,2500});
		//boolean run = RotationCheck.run("asdfk","dfas");
		//int run = WordsRotationPoint.run(new String[] {"ta","te","z","a","bsd", "gds", "rew", "sasfd"});
		//String run = AllSubstrings.run("sasfd");
		//boolean run = AnagramCheck.run("asdf", "fd");
		//int run = Fibonacci.run(6);
		//boolean run = IsSubstring.run("asdfjkl", "df");
		//boolean run = PermutationPalindrome.run("asdfsdfw");
		//ReverseLinkedList.run();
		//String run = ReverseSentence.run("first second third");
		//String run = ReverseString.run("First");
		//boolean run = UniqueCharacters.run("asdfkjle");
		//String run = Arrays.toString(CountingSort.run(new int[] {4,7,9,1,3,4,10,35}, 35));
		//String run = Arrays.toString(MergeSort.run(new int[] {1,4,6,8,9,15,17,28}, new int[] {3,5,8,8,19,28,30}));
		//int run = LevenshteinDistance.run("adsfklgsd", "adsfgklsfjlk", "tabulation");
		//int run = LongestCommonSubsequence.run("asdffgjd;lkkasfdl", "asdgjfhflkj;kasdfl", "tabulation");
		//int run = LongestCommonSubstring.run("asdf", "jaskl");
		//int run = LongestPalindromicSubsequence.run("sarffs", "tabulation");
		//int run = LongestPalindromicSubstring.run("kgldfdljhkas");
		//int run = MakingChange.run(new int[] {1, 5, 10, 25}, 15);
		//int run = MinimumChange.run(new int[] {1, 5, 6, 10, 25}, 12);
		//String run = Arrays.toString(ProductOfOthers.run(new int[] {1, 4, 5, 2, 3}));
		//int run = RodCutting.run(new int[] {1,5,8,9,10,17,17,20}, 8);
		//ParenthesesCombinations.run(5);
		//StringPermutations.run("asdf");
		//int run = MapPermutations.run(new boolean[10][10], "recursive");
		//int run = WaysToCoverSteps.run(10, "recursive");
		//TowerOfHanoi first = new TowerOfHanoi();
		//int run = WeightValueProblem.run(8);
		//DeleteLinkedListNode.run();
		//int run = KthToLastNode.run();
		//boolean run = LinkedListCycle.run();
		//int run = MaximumKnapsack.run(new ItemType[] {new ItemType(7, 160), new ItemType(5, 90), new ItemType(3, 50)}, 1300, "tabulation");
		//int run = MinimumChange.run(new Coin[] {new Coin(2, 15), new Coin(4, 90)}, 800, "tabulation");
		//int run = WaysToKnapSack.run(new ItemType[] {new ItemType(7, 160), new ItemType(4, 90), new ItemType(2, 15)}, 1200, "memoization");
		int run = WaysToMakeChange.run(new Coin[] {new Coin(1, 1), new Coin(5, 5), new Coin(10, 10)}, 500, "tabulation");
		
		//int run = Rand5.run());
		//int run = Rand7.run();
		//BinaryTreeLevelOutput.run();
		//QueueWithTwoStacks.run();
		//StackWithTwoQueues.run();
		//int run = AllSeqOfSums.run(6);
		//int run = WaysToSum.run(6);
		//int run = MinMaxBinaryTreeDepth.run("min");
		//BreadthFirstTraversal.run();
		//DepthFirstTraversal.run("postorder");


		
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println(elapsedTime + "ms");
		
		System.out.println(run);
	}
}
