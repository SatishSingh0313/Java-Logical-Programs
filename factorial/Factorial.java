package com.factorial;

public class Factorial {
    public static void main(String[] args) {
		int n=5, fact=1;
		
//		for(int i=n;i>=1;i--)
//			fact=fact*i;
//		System.out.println("the factorial of 5 is "+fact);
		
		for(int i=1;i<=n;i++)
			fact=fact*i;
			System.out.println("The 5 factorial is "+fact);
	}
}
