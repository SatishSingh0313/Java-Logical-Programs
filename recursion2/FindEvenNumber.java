package com.recursion2;

public class FindEvenNumber {
		static int n=10 , m=2;
		public static void display() {
			if(n-->=1) {
				System.out.println(m+" ");
				m+=2;
				display();
			}
		}
		public static void main(String[] args) {
			display();
		}
}
