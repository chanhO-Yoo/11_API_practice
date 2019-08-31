package com.api.member.model.run;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.api.member.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		int index = 0;
		int index2 = 0;
		Member[] memArr = new Member[3];
		
		String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";
		StringTokenizer st = new StringTokenizer(str,"|");
		
		while(st.hasMoreTokens()) {
			memArr[index] = new Member();
			StringTokenizer st2 = new StringTokenizer(st.nextToken(),",");
			String[] strArr = new String[st2.countTokens()];
			
			while(st2.hasMoreTokens()) {
				strArr[index2] = st2.nextToken();
				index2++;
			}
			index2 = 0;
			

			for(int i=0;i<st.countTokens();i++) {
				memArr[index].setMemberNo(Integer.parseInt(strArr[0]));
				memArr[index].setMemberName(strArr[1]);
				memArr[index].setHeight(Integer.parseInt(strArr[2]));
				memArr[index].setWeight(Integer.parseInt(strArr[3]));
				Calendar c = Calendar.getInstance();
				c.set(1992, 12, 9);//Integer.parseInt(strArr[3])
				memArr[index].setBirth(c);
			}
			
			System.out.println(memArr[0].getMemberNo());
		}
		
//		for(int i=0;i<index2;i++) {
//			System.out.println(memArr[i].information());
//		}
		
		
		
	}
}
