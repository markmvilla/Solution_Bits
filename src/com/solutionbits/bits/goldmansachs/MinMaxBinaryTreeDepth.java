package com.solutionbits.bits.goldmansachs;

import com.solutionbits.bits.util.BinaryTree;
import com.solutionbits.bits.util.Node;

public class MinMaxBinaryTreeDepth {

	public static int run(String method){
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1);  
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4);
		switch(method){
		case "max" : 
			return recursiveMax(tree.root);
		
		case "min" : 
			return recursiveMin(tree.root);
			
		default:
			return -1;
		}
	}
	
	public static int recursiveMin(Node current) {

		if(current == null) return 0;
		if(current.left == null && current.right == null)	return 1;
		if(current.left == null) return recursiveMin(current.right) + 1;
		if(current.right == null) return recursiveMin(current.left) + 1;
		
		return Math.min(recursiveMin(current.left)+1, recursiveMin(current.right)+1);
	}
	
	public static int recursiveMax(Node current) {

		if(current == null) return 0;
		if(current.left == null && current.right == null)	return 1;
		if(current.left == null) return recursiveMax(current.right) + 1;
		if(current.right == null) return recursiveMax(current.left) + 1;
		
		return Math.max(recursiveMax(current.left)+1, recursiveMax(current.right)+1);
	}
	

}
