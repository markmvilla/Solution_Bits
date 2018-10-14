package com.solutionbits.bits;

public class DeleteLinkedListNode {

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
		public void deleteNode(int index){
			Node node = getNode(index);
			Node trail = head;
			Node front = head.next;
			if(trail == node){
				this.head = front;
				if(front.next == null){
					this.tail = front;
				}
			}else{
				while(front != null){
					if(front == node){
						trail.next = front.next;
						if(front.next == null){
							this.tail = front;
						}
						break;
					}
					trail = front;
					front = front.next;
				}
			}
			size--;
		}
		
		//t O(1) s O(1) reference is just reassigned to next and "reference.next" will be a dangling node.
		//cannot support a tail property because assigning tail would take t O(n))
		public void deleteNode2(Node node){
			if(node == head){
				head = head.next;
			}
			else if(node.next != null){
				node = node.next;
			}else{
				node = null;
			}
			size--;
		}

	}

	public static void run(){
		LinkedList list = new LinkedList();
		list.add(20);
		list.add(4);
		list.add(15);
		list.add(10);
		list.deleteNode(2);
		System.out.println(list.head.data);
	}
	
}
