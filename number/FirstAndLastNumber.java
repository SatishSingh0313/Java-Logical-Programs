package com.number;

public class FirstAndLastNumber {
   public static void main(String[] args) {
	int n=731542, x=n%10;
	while(n > 10) {
		n=n/10;
	}
	System.out.println(n+""+x);
}
}
