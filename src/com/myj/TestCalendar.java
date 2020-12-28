package com.myj;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
public class TestCalendar {
	public static void main(String[] args) {
        //��ȡ��ǰ�µ�һ�죺
//		 Calendar c = Calendar.getInstance();
//		 	c.add(Calendar.MONTH, 0);
//		 	c.set(Calendar.DAY_OF_MONTH,1);//����Ϊ 1 ��,��ǰ���ڼ�Ϊ���µ�һ��
//		
//		String first =format.format(c.getTime());
//		 System.out.println("===============first:"+first);
//		
//		 //��ȡ��ǰ�����һ��
//		 Calendar ca = Calendar.getInstance();
//		 ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
//		 String last = format(ca.getTime());
//		 System.out.println("===============last:"+last);
//		
		 //Java 8 
		 LocalDate today = LocalDate.now(); 
		 //���µĵ�һ��
		 LocalDate firstday = LocalDate.of(today.getYear(),today.getMonth(),1); 
		 //���µ����һ��
		 LocalDate lastDay =today.with(TemporalAdjusters.lastDayOfMonth()); 
		 System.out.println("���µĵ�һ��"+firstday); 
		 System.out.println("���µ����һ��"+lastDay);
		 
		 SimpleDateFormat oldFormatter = new SimpleDateFormat("yyyy/MM/dd");
			Date date1 = new Date();
		 	System.out.println(oldFormatter.format(date1));
		 
		 DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		 	LocalDate date2 = LocalDate.now();
		 	System.out.println(date2.format(newFormatter));
	
		 	
		 	
		 	
		 	
	}
}
