package com.solutionbits.bits.goldmansachs;

import java.util.Stack;
import java.util.NoSuchElementException;

//stack library with included functions
public class QueueWithTwoStacks {

	Stack<Integer> inStack = new Stack<>();
	Stack<Integer> outStack = new Stack<>();
	
	public static void run(){
		QueueWithTwoStacks test = new QueueWithTwoStacks();
		test.enqueue(1);
		test.enqueue(2);
		test.enqueue(3);
		System.out.println(test.dequeue());
		System.out.println(test.dequeue());
		System.out.println(test.dequeue());
		System.out.println(test.dequeue());
	}
	
	public void enqueue(int item) {
		inStack.push(item);
	}
	
	public int dequeue() {
		if(outStack.isEmpty()) {
			while(!inStack.empty()) {
				outStack.push(inStack.pop());
			}
			if(outStack.empty()) {
				throw new NoSuchElementException("Empty Stack");
			}
		}
		return outStack.pop();
	}
	
}
