package com.number;

public class DecimalToBinaryNumber {

	public static void main(String[] args) {
		int n=10,temp=1, bin=0;
		
		while(n!=0) {
			
			bin = bin+((n%2)*temp);
			temp=temp*10;
			n=n/2;
		}
		System.out.println(bin);

	}

}
