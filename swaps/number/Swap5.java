package com.swaps.number;

public class Swap5 {
	public static void main(String[] args) {
		int a=10, b=20;
		
		System.out.println("Before Swap a="+a+" b="+b);
		b=a+b-(a=b);
		
		System.out.println("After Swaping a="+a+" b="+b);
	}
}
