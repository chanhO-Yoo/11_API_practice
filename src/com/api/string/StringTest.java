package com.api.string;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args) {
		StringProcess sp = new StringProcess();
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String inputStr = sc.next();
		System.out.print("문자를 입력하세요 : ");
		char inputChar = sc.next().charAt(0);
		
		System.out.println(sp.preChar(inputStr));
		System.out.println(sp.charSu(inputStr,inputChar));
	}
}
