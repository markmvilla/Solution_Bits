package com.solutionbits.bits.goldmansachs;

import com.solutionbits.bits.util.BinaryTree;
import com.solutionbits.bits.util.Node;

public class BinaryTreeLevelOutput {

	public static void run(){			
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1);  
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4);
        printAllLevels(tree.root, 3);
	}
	
	static void printAllLevels(Node root, int height) {
		for(int i =0; i<height; i++) {
			printLevel(root, i);
			System.out.print("\n");
		}
	}
	
	static void printLevel(Node node, int level) {
		if(node == null) return;
		if(level == 0) {
			System.out.print(node.data + " ");
			return;
		}else {
			printLevel(node.left, level-1);
			printLevel(node.right, level-1);
		}
	}
	
}
