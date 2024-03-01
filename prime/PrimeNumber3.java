package com.prime;

public class PrimeNumber3 {
  public static void main(String[] args) {
	int n=997, count =0, lc=0;
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(count>0)
			break;
	    if(n%i==0)
	    	count++;
	    lc++;
	}
	if(count==0)
		System.out.println("Prime No.");
	else
		System.out.println("Not a Prime");
	System.out.println("Loop Count= "+lc);
}
}
