package com.number;

public class Number7 {
	public static void main(String[] args) {
		int n=10;
		int a=1,b=1,c=0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
			c=a+b;
			System.out.println(a+" ");
			a=b;
			b=c;
		} 
		else {
			System.out.println(i+1+" ");
		}
	}
}
}
