package com.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {
	private static String inputStr = "J a v a P r o g r a m ";
	
	public static void main(String[] args) {
		int i=0;
		
		//토큰 처리 전 문자열 출력
		System.out.println(inputStr);
		
		//토큰 처리 전 글자 갯수 출력
		System.out.println(inputStr.length());
		
		//토큰 처리 후 글자 갯수 출력 확인
		StringTokenizer s = new StringTokenizer(inputStr," ");
		char[] inputChar = new char[s.countTokens()];
		System.out.println(s.countTokens());
		
		while(s.hasMoreTokens()) {
			inputChar[i] = s.nextToken().charAt(0);
			i++;
		}
		
		//char[] 값 출력
		System.out.println(inputChar);
		
		//char[]을 다시 String으로 변환 후 대문자로 출력
		String changeStr = "";
		for(int j=0;j<inputChar.length;j++) {
			changeStr += inputChar[j];			
		}
		changeStr = changeStr.toUpperCase();
		System.out.println(changeStr);
	}
}
