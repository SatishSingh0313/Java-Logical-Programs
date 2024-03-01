package com.recursion2;

public class FindOddNumber {
	static int n=10 , m=1;
	public static void display() {
		if(n-->=1) {
			System.out.println(m+" ");
			m+=2;
			display();
		}
	}
	public static void main(String[] args) {
		display();
	}
}
