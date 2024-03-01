package com.number;

public class TotalDigitOfNumber {
     public static void main(String[] args) {
		int n=9876512,count=0, m=n;
		while(n !=0) {
			n=n/10;
			count++;
		}
		System.out.println("total no of digits in "+m+" is "+count);
	}
}
