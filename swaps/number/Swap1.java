package com.swaps.number;

public class Swap1 {
	public static void main(String[] args) {
		int a=10 ,b=20, temp=0;
		
		System.out.println("Before Swap a="+a+" b="+b);
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swaping a="+a+" b="+b);
	}
}
