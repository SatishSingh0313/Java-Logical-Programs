package com.pattern;

public class Pattern9 {
 public static void main(String[] args) {
	int n=4;
	for(int i=n;i>=1;i--)
	{
		for(int j=n;j>=1;j--)
			System.out.print((char)(j+64)+" ");
		System.out.println();
	}
}
}
