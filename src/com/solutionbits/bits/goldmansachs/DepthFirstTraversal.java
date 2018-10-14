package com.solutionbits.bits.goldmansachs;

import com.solutionbits.bits.util.BinaryTree;
import com.solutionbits.bits.util.Node;
import java.util.Queue;
import java.util.LinkedList;

//The main algorithmic strategy is to use q Queue
public class DepthFirstTraversal {

	public static void run(String order){
		
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1);  
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(6);
        tree.root.left.left.right = new Node(7);
        tree.root.left.left.left.left = new Node(8);
        tree.root.right.right = new Node(85);
        tree.root.right.right.left = new Node(23);
        if(order.equals("preorder")) {
        	recursivePreOrder(tree.root);
        }
        else if(order.equals("inorder")) {
        	recursiveInOrder(tree.root);
        }
        else if(order.equals("postorder")) {
        	recursivePostOrder(tree.root);
        }

	}
	
	public static void recursivePreOrder(Node current) {
		if(current == null) return;
		System.out.println(current.data);
		recursivePreOrder(current.left);
		recursivePreOrder(current.right);
	}
	
	public static void recursiveInOrder(Node current) {
		if(current == null) return;
		recursiveInOrder(current.left);
		System.out.println(current.data);
		recursiveInOrder(current.right);
	}
	
	public static void recursivePostOrder(Node current) {
		if(current == null) return;
		recursivePostOrder(current.left);
		recursivePostOrder(current.right);
		System.out.println(current.data);
	}

}
