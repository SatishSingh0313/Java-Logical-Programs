package com.palindrom;

public class PalindromNumber {
   public static void main(String[] args) {
	int n=12321 , rev=0 , m=n;
	while(n !=0) {
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	System.out.println(m==rev?"Palindrom":"Not Palindrom");
}
}
