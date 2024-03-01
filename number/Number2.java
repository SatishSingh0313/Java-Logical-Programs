package com.number;

public class Number2 {  // 2 1 4 3 6 5 8 7 10 9 12 11 .......n
	public static void main(String[] args) {
		int n=12;
		for(int i=1;i<=n;i++) {
			
			if(i%2==0) {
				System.out.println(i-1);
			}
			else {
				System.out.println(i+1);
			}
		}
		
	}
}
