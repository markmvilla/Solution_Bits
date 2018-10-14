package com.solutionbits.bits;

import java.util.Stack;

public class TowerOfHanoi {
	static int towerCount = 3;
	static int diskCount = 5;
	static Tower[] towers = new Tower[towerCount];
	
	public TowerOfHanoi(){
		for(int i=0; i<towerCount; i++){
			towers[i] = new Tower(i);
		}
		
		for (int i=diskCount-1; i>=0; i--){
			towers[0].add(i);
		}
	}
	
	public static class Tower{
		private Stack<Integer> disks;
		private int towerID;
		
		private Tower(int id){
			disks = new Stack<Integer>();
			towerID = id;
		}
		
		public int getSize(){
			return disks.size();
		}
		
		public void add(int disk){
			if(!disks.isEmpty() && disks.peek() <= disk){
				System.out.println("error");
			}else{
				disks.push(disk);
			}
		}
		
		public void moveTopTo(Tower tower){
			int top = disks.pop();
			tower.add(top);
		}
		
		//t O(2^n) s O(1) call stack
		//verify time complexity 
		public void moveDisks(int diskID, Tower destination, Tower buffer){
			if(diskID>0){
				moveDisks(diskID-1,buffer,destination);
				moveTopTo(destination);
				buffer.moveDisks(diskID-1,destination,this);
			}
		}
	}
	
	public static void run(){
		System.out.println(towers[0].getSize());
		System.out.println(towers[2].getSize());
		
		towers[0].moveDisks(diskCount, towers[2], towers[1]);

		System.out.println(towers[0].getSize());
		System.out.println(towers[2].getSize());	
	}
}
