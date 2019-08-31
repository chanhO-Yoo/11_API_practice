package com.api.string;

public class StringProcess {
	//1. 문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드
	public String preChar(String s) {
		char[] change = s.toCharArray();
		String changeStr = "";
		change[0] = Character.toUpperCase(change[0]);
		for(int i=0;i<change.length;i++) {
			changeStr += change[i];
		}
		
		return changeStr;
	}
	
	//2. 문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드
	public int charSu(String s, char ch) {
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				count++;
			}
		}
		
		return count;
	}
}
