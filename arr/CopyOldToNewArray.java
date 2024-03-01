package com.arr;

public class CopyOldToNewArray {
	public static void main(String[] args) {

		int arr[] = new int[] {10,20,30,40,50};
		//creating new array
		int arr2[] = new int [arr.length];
		
		//copying array elements from arr--> arr2
		for(int i=0; i<arr.length;i++) 
			arr2[i] =arr[i];
			
		//display arr2 using for each loop
			for(int i:arr2) {
				System.out.print(i+" ");
			}
		}
	}

