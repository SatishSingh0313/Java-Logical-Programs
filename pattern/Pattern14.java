package com.pattern;

public class Pattern14 {
		public static void main(String[] args) {
			int n=5;
			for(int i=n;i>=1;i--) {
				for(int j=1;j<=n-i;j++)
					System.out.print(" ");
				for(int j=1;j<=i;j++)
					System.out.print("* ");
				//System.out.print(i*2-1+" ");
				System.out.println();
			}
		}
}
