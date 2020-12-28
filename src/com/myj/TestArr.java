package com.myj;

public class TestArr {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		for (int x : arr) { 
			System.out.print(x+" "); 
		}

		
		int[] arr1 = {1, 2, 3}; 
		printArray(arr1); 
			
	}
	
	
	public static void printArray(int[] a) { 
		for (int x : a) { 
		System.out.println(x+" "); 
		} 
		System.out.println(a.length);
	}
	
	
}
