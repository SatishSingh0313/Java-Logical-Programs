package com.factorial;

public class PowerOfNumber {
   public static void main(String[] args) {
	int base=3, pow=3, op=1;
	while(pow>=1){   //while(pow-->=1) 
		op=op*base;
		pow--;
	}
	System.out.println("3 power of 3 is "+op);
}
}
