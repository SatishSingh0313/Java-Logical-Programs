package com.recursion2;

public class FibonacciSeries {
	static int n=10, a=0, b=1, c=0;
	public static void display() {
		if(n-->=1) {
			c=a+b;
			System.out.println(a+" ");
			a=b;
			b=c;
			display();
		}
	}
		public static void main(String[] args) {
			display();
		}
}
