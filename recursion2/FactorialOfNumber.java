package com.recursion2;

public class FactorialOfNumber {
	static int n=5;
	public static int printMe() {
		if(n == 1)
			return 1;
		return n-- * printMe();
	}
	
	public static void main(String[] args) {
		
		System.out.println(printMe());
		
	 }
}
