package com.myj;

public class TestFor {
	public static void main(String[] args) {
		int i = 0;
		for (foo('A'); (i < 2) && foo('B'); foo('C')) {
			i++;
			foo('D');
		}
	}
	static boolean foo(char c) {
		System.out.print(c);
		return true;
	}
	
	

}
