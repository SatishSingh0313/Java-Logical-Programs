package com.recursion2;

public class NumberReverse {  // Print -> 1 2 3 4 5 4 3 2 1 
		static int n=5;
		public static void display(int x) {
			if(n-->1) {
				System.out.print(x+" ");
				display(x+1);
			}
			System.out.print(x+" ");
		}
		public static void main(String[] args) {
			display(1);
		}
}
   