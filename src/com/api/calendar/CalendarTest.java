package com.api.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		int year = c.get(c.YEAR);
		int month = c.get(c.MONTH)+1;
		int date = c.get(c.DAY_OF_MONTH);
		int hour = c.get(c.HOUR_OF_DAY);
		int minute = c.get(c.MINUTE);
		int second = c.get(c.SECOND);
		
		int day = c.get(c.DAY_OF_WEEK);
		String day_ = "";
		
		switch(day) {
		case 1:
			day_ = "일요일";
			break;
		case 2:
			day_ = "월요일";
			break;
		case 3:
			day_ = "화요일";
			break;
		case 4:
			day_ = "수요일";
			break;
		case 5:
			day_ = "목요일";
			break;
		case 6:
			day_ = "금요일";
			break;
		case 7:
			day_ = "토요일";
			break;
		default:
			return ;	
		}
		
		System.out.println(year+"년 "+month+"월 "+date+"일 "+day_);
	}
}
