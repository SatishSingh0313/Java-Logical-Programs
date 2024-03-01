package com.recursion1;

public class FindReminder {
	public static int findReminder(int num1, int num2) {
		int reminder=0;
		reminder=num1%num2;
		
		return reminder;
	}
		public static void main(String[] args) {
	     int c=0;
	      c = findReminder(10,6);
	      System.out.println(c);
		}
}
