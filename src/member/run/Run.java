package member.run;

import member.controller.MemberManager;
import member.model.vo.Gold;
import member.model.vo.Ruby;
import member.model.vo.Silver;
import member.model.vo.Vip;
import member.model.vo.Vvip;

public class Run {
	public static void main(String[] args) {
		MemberManager mgr = new MemberManager();
        mgr.insertMember(new Silver("홍길동", "Silver",1000));
        mgr.insertMember(new Silver("고길동", "Silver",2000));
        mgr.insertMember(new Silver("홍동민", "Silver",3000));
        mgr.insertMember(new Gold("김회장", "Gold",1000));
        mgr.insertMember(new Gold("이회장", "Gold",2000));
        mgr.insertMember(new Gold("오회장", "Gold",3000));
        mgr.insertMember(new Vip("이순신", "Vip",10000));
        mgr.insertMember(new Vvip("신사임당", "Vvip",100000));
        mgr.insertMember(new Ruby("세종", "Ruby",500000));
        mgr.printData();
        System.out.println("==================================");
        mgr.printBuyInfo(10000);
	}
}
