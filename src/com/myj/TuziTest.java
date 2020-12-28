package com.myj;


import java.util.Scanner;

public class TuziTest {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//int a = sc.nextInt();
		int a = 10;
		System.out.println("第"+a+ "个月有"+oo(a)+"对兔子");		
	}
	private static int oo(int n) {
		if (n==1 || n==2)
			return 1;
		else 
			return oo(n-2)+oo(n-1);	
	}
	
		

}
