package com.pattern;

public class Pattern17 {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n*2-1;i++) {
			for(int j=0;j<n;j++)
			if((i==0 || i==n-1 || i== n*2-2) && j==n-1)
				System.out.print(" ");
			else if(j==0 || j==n-1 || i==0 || i==n-1 || i==n*2-2)
				System.out.print("* ");
			else
				System.out.print("  ");
			System.out.println();
		}
	}
}
