package com.recursion1;

public class ReverseNumber {
	public static void reverse(int n) {
		if(n>=1) {
			System.out.println(n+" ");
			reverse(n-1);
		}
	}
	public static void main(String[] args) {
		reverse(10);
	}
}
