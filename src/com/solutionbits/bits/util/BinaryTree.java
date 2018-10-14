package com.solutionbits.bits.util;

public class BinaryTree {
	
	public Node root;
	
	public BinaryTree(int data){
		root = new Node(data);
	}
	
	public BinaryTree(){
		root = null;
	}
	
	public static void main(String[] args) 
    { 
        BinaryTree tree = new BinaryTree(); 
  
        /*create root*/
        tree.root = new Node(1);  
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        /* 4 becomes left child of 2 
                    1 
                /       \ 
               2          3 
             /   \       /  \ 
            4    null  null  null 
           /   \ 
          null null 
         */
        
    } 
	
}
