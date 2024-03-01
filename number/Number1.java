package com.number;

public class Number1 {
      public static void main(String[] args) {
		int n=10;
		int lp=0,i=1;
		for(;;) {
			if(i>n) {
				break;
				
			}
			System.out.println(i++ +" ");
			lp++;
		}
		
		System.out.println("count="+lp);
	}
}
