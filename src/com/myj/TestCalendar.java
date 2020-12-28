package com.myj;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
public class TestCalendar {
	public static void main(String[] args) {
        //获取当前月第一天：
//		 Calendar c = Calendar.getInstance();
//		 	c.add(Calendar.MONTH, 0);
//		 	c.set(Calendar.DAY_OF_MONTH,1);//设置为 1 号,当前日期既为本月第一天
//		
//		String first =format.format(c.getTime());
//		 System.out.println("===============first:"+first);
//		
//		 //获取当前月最后一天
//		 Calendar ca = Calendar.getInstance();
//		 ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
//		 String last = format(ca.getTime());
//		 System.out.println("===============last:"+last);
//		
		 //Java 8 
		 LocalDate today = LocalDate.now(); 
		 //本月的第一天
		 LocalDate firstday = LocalDate.of(today.getYear(),today.getMonth(),1); 
		 //本月的最后一天
		 LocalDate lastDay =today.with(TemporalAdjusters.lastDayOfMonth()); 
		 System.out.println("本月的第一天"+firstday); 
		 System.out.println("本月的最后一天"+lastDay);
		 
		 SimpleDateFormat oldFormatter = new SimpleDateFormat("yyyy/MM/dd");
			Date date1 = new Date();
		 	System.out.println(oldFormatter.format(date1));
		 
		 DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		 	LocalDate date2 = LocalDate.now();
		 	System.out.println(date2.format(newFormatter));
	
		 	
		 	
		 	
		 	
	}
}
