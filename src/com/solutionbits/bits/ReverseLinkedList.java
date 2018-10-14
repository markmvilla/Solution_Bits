package com.solutionbits.bits;

public class ReverseLinkedList {

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
			}
			size++;
			
			this.tail.next = new_node;
			this.tail = new_node;
		}
		
		//t O(n) s O(1)
		public void reverseLinkedList(){
			Node prev = null;
			Node curr = this.head;
			Node next = null;
			
			this.tail = this.head;
			while(curr != null){
				next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = next;
			}
			
			this.head = prev;
		}
		
	}

	public static void run(){
		LinkedList list = new LinkedList();
		list.add(20);
		list.add(4);
		list.add(15);
		list.add(10);
		list.add(1364);
		list.add(264);
		list.add(597);
		list.add(2346);
		System.out.println(list.head.next.data);
		list.reverseLinkedList();
		System.out.println(list.head.next.next.next.data);
	}
	
}
