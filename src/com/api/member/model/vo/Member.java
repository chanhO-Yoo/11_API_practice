package com.api.member.model.vo;

import java.util.Calendar;

public class Member {
	//field
	private int memberNo;
	private String memberName;
	private int height;
	private int weight;
	private Calendar birth;
	
	//constructor
	public Member() {
		
	}
	public Member(int memberNo, String memberName, int height, int weight, Calendar birth) {
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.height = height;
		this.weight = weight;
		this.birth = birth;
	}
	
	//gettet & setter
	//getter
	public int getMemberNo() {
		return memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public Calendar getBirth() {
		return birth;
	}
	//setter
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setBirth(Calendar birth) {
		this.birth = birth;
	}
	
	//method
	public String information() {
		String info = birth.get(Calendar.YEAR)+"/"+(birth.get(Calendar.MONTH)+1)+"/"+birth.get(Calendar.DATE);
		System.out.println(info);
		
		String str = this.getMemberNo()+"\t"+this.getMemberName()+"\t"+this.getHeight()+"\t"+getWeight()+"\t"+getBirth();
		return str;
	}
}
