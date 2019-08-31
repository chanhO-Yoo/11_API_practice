package com.api.calendar;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalcDday {
	public static void main(String[] args) {
		String dDayStr = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 D-day 날짜를 지정하세요(년, 월, 일) : ");
		dDayStr = sc.next();
		
		StringTokenizer st = new StringTokenizer(dDayStr,", ");
		int dDayYear = Integer.parseInt(st.nextToken());
		int dDayMonth = Integer.parseInt(st.nextToken());
		int dDayDate = Integer.parseInt(st.nextToken());
		
		Calendar today = Calendar.getInstance();
		Calendar dDay = Calendar.getInstance();
		dDay.set(dDayYear, dDayMonth-1, dDayDate);
		
		long diff = today.getTimeInMillis()-dDay.getTimeInMillis();
		int diffDay = (int)(diff/1000/60/60/24);
		
		if((diff <= 86400000) && (diff >= 0)) {
			System.out.println("D-Day입니다.");
		}
		else if(diff > 86400000) {
			System.out.println(diffDay+1+"일 지났습니다.");
		}
		else if(diff < 0) {
			System.out.println(diffDay*-1+"일 남았습니다.");
		}
		
		
		
	}
}
