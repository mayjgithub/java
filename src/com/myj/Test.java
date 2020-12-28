package com.myj;

import java.time.Clock;
import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
		System.out.println("helloworld");
		System.out.print(Integer.MAX_VALUE*2);
		System.out.println(Integer.MIN_VALUE*2);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		Calendar.getInstance().getTimeInMillis();
		System.out.println(System.currentTimeMillis());

		
		System.out.println(Clock.systemDefaultZone().millis());
	}
	
}
	

	
