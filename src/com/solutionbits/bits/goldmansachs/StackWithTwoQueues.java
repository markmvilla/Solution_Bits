package com.solutionbits.bits.goldmansachs;

import java.util.Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;

//Queue and LinkedList library with included functions
public class StackWithTwoQueues {

	Queue<Integer> inQueue = new LinkedList<>();
	Queue<Integer> outQueue = new LinkedList<>();
	
	public static void run(){
		StackWithTwoQueues test = new StackWithTwoQueues();
		test.push(1);
		test.push(2);
		test.push(3);
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.pop());
		System.out.println(test.pop());
	}
	
	public void push(int item) {
		inQueue.add(item);
		while(!outQueue.isEmpty()) {
			inQueue.add(outQueue.remove());
		}
		Queue<Integer> temp = new LinkedList<>();
		temp = inQueue;
		inQueue = outQueue;
		outQueue = temp;
	}
	
	public int pop() {
		if(outQueue.isEmpty()) {
			throw new NoSuchElementException("Empty Queue");
		}else {
			return outQueue.remove();
		}
	}
	
}
