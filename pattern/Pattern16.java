package com.pattern;

public class Pattern16 {
	public static void main(String[] args) {
		int n=3;
		for(int i=n;i>=-n;i--) {
			for(int j=1;j<=Math.abs(i);j++)
				System.out.print("  ");
			//System.out.print(" ");
			for(int j=n;j>=Math.abs(i);j--)
				System.out.print("* ");
			System.out.println();
		}
		
	}
}
