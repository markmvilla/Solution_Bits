package com.solutionbits.bits.util;

public class Items {
	
	public static class ItemType{
		public final int weight;
		public final int value;
		
		public ItemType(int weight, int value) {
			this.weight = weight;
			this.value = value;
		}
	}
	
	public static class Coin{
		public final int denomination;
		public final int value;
		
		public Coin(int denomination, int value) {
			this.denomination = denomination;
			this.value = value;
		}
	}
	
	public static class Rod{
		public final int size;
		public final int value;
		
		public Rod(int size, int value) {
			this.size = size;
			this.value = value;
		}
	}
	
	
}
