package com.prime;

public class PrimeNumber2 {
 public static void main(String[] args) {
	int n=11, count=0,lc=0;
	for(int i=1;i<=n;i++) {
	
	
		if(n%i==0)
			count++;
	lc++;
 }
	if(count==2)
		System.out.println("Prime No.");
	else  
		System.out.println("Not a Primr No.");
	
	System.out.println("Loop Count "+lc);
}
}
