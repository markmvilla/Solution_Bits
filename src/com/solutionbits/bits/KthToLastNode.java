package com.solutionbits.bits;

public class KthToLastNode {

	public static class LinkedList{
		public Node tail;
		public int size = 0;
		public Node head = null;

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
		
		public Node getNode(int index){
			int count = 0;
			Node node = this.head;
			while(count != index){
				node = node.next;
				count++;
			}
			return node;
		}
		
		//t O(n) s O(1)
		//verify time complexity 
		public int kthToLastNodeValue(int k){
			Node frontNode = head;
			Node trailNode = head;

			for(int i = 0; i<=k-1; i++){
				frontNode = frontNode.next;
			}
			
			while(frontNode.next != null){
				trailNode = trailNode.next;
				frontNode = frontNode.next;
			}
			return trailNode.data;
		}

	}

	public static int run(){
		LinkedList list = new LinkedList();
		list.add(20);
		list.add(4);
		list.add(15);
		list.add(10);
		list.add(11);
		list.add(14);
		list.add(18);
		return list.kthToLastNodeValue(6);
	}
	
}
