package com.recursion2;

public class SumOfNaturalNumber1 {
	static int n=5;
	public static int printMe(int x) {
		if(x==n)
			return x;
		return x+printMe(x+1);
	}
	public static void main(String[] args) {
		System.out.println(printMe(1));
	}
}
