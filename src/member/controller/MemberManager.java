package member.controller;

import member.model.vo.Buyable;
import member.model.vo.Gold;
import member.model.vo.Member;
import member.model.vo.Ruby;
import member.model.vo.Silver;
import member.model.vo.Vip;
import member.model.vo.Vvip;

public class MemberManager{
	public final int MAX_MEMBER = 40;
	Member[] memberArr = new Member[MAX_MEMBER];

	int index=0;
	
	public void insertMember(Member m) {
		if(m instanceof Silver) {
			memberArr[index] = m;
			index++;
		}
		else if(m instanceof Gold) {
			memberArr[index] = m;
			index++;
		}
		else if(m instanceof Vip) {
			memberArr[index] = m;
			index++;
		}
		else if(m instanceof Vvip) {
			memberArr[index] = m;
			index++;
		}
		else if(m instanceof Ruby) {
			memberArr[index] = m;
			index++;
		}
	}
	
	public void printData() {
		System.out.println("------------<<회원정보>>------------");
		System.out.println("이름\t등급\t포인트\t이자포인트");
		System.out.println("----------------------------------");
		for(int i=0;i<index;i++) {
			System.out.println(memberArr[i].getName()+"\t"+memberArr[i].getGrade()+"\t"+memberArr[i].getPoint()+"\t"+memberArr[i].getInterestPoint()*memberArr[i].getPoint());
		}
	}
	
	public void printBuyInfo(int price) {
		for(int i=0;i<index;i++) {
			System.out.println(memberArr[i].getGrade()+"등급회원 "+memberArr[i].getName()+"은(는) "+price+"원 상품을 "+(int)(memberArr[i].buy(price)*(1-memberArr[i].getInterestPoint()))+"원에 구매합니다.");
		}
	}
	
}
