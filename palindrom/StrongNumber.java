package com.palindrom;

public class StrongNumber {
	public static void main(String[] args) {
		int fact, n=145,m=n,sum=0;
		while(n!=0) {
			int rem=n%10;
			fact=1;
			for(int i=rem;i>=1;i--) {
				fact=fact*i;
				
			}
			sum=sum+fact;
			n=n/10;
		}
		System.out.println((sum==m)?"Strong no" :" not strong no" );
	}
}
