package com.solutionbits.bits;

import java.util.HashSet;

public class LinkedListCycle {

	public static class LinkedList{
		public Node tail;
		public Node head = null;
		public int size = 0;

		public class Node {
			int data;
			public Node next;
			public Node(int data){
				this.data = data;
				this.next = null;
			}
		}
		
		public void add(int new_data){
			Node new_node = new Node(new_data);
			if(size == 0){
				this.head = new_node;
				this.tail = new_node;
			}
			size++;
			this.tail.next = new_node;
			this.tail = new_node;
			
		}
		
		//t O(n) s O(n)
		//verify time complexity 
		public boolean detectNodeLoop(){
			HashSet<Node> set = new HashSet<Node>();
			Node temp = this.head;
			while(temp != null){
				if(set.contains(temp)){
					return true;
				}
				set.add(temp);
				temp = temp.next;
			}
			return false;
		}
		
		//t O(n) s O(1)
		public boolean detectNodeLoop2(){
			Node slow = this.head;
			Node fast = this.head;
			while(fast.next != null && fast.next.next != null){
				fast = fast.next;
				if(fast == slow) return true;
				fast = fast.next;
				if(fast == slow) return true;
				slow = slow.next;
			}
			return false;
		}
	}

	public static boolean run(){
		LinkedList list = new LinkedList();
		list.add(20);
		list.add(4);
		list.add(15);
		list.add(10);
		list.head.next.next.next.next = list.head;
		//return list.detectNodeLoop();
		return list.detectNodeLoop2();
	}
	
}
