package com.number;

public class BinaryToDecimalNumber {
	public static void main(String[] args) {
		int n=110010, temp=1, decimal=0;
		
		while(n!=0) {
			decimal = decimal+((n%10)*temp);
			temp=temp*2;
			n=n/10;
		}
		System.out.println(decimal);
	}
}
