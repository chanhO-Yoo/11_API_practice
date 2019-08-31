package com.api.calendar;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CalcYourDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일을 입력하세요(년, 월, 일) : ");
		String input = sc.next();
		StringTokenizer st = new StringTokenizer(input,", ");
		
		int yearOfBirth = Integer.parseInt(st.nextToken());
		int monthOfBirth = Integer.parseInt(st.nextToken())-1;
		int dateOfBirth = Integer.parseInt(st.nextToken());
		
		Calendar birth = Calendar.getInstance();
		birth.set(yearOfBirth, monthOfBirth, dateOfBirth);
		
		
		Calendar today = Calendar.getInstance();
		
		long diff = today.getTimeInMillis()-birth.getTimeInMillis();

		System.out.println("오늘은 태어난지 "+(diff/1000/60/60/24+1)+"일입니다");
	}
}
