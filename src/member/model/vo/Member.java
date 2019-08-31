package member.model.vo;

/*
 * 인터페이스의 추상메서드는
 * 추상클래스인 경우에 한해서
 * 선택적으로 구현할 수 있다.
 *   - member 클래스에서 buy메서드를 구현할 수 있고,
 *     구현하지 않고 member의 자식 클래스에서 구현해도 된다.
 * 
 */
public abstract class Member implements Buyable{
	//field
	private String name;
	private String grade;
	private int point;
	
	//constructor
	public Member() {
		
	}
	public Member(String name, String grade, int point) {
		this.name = name;
		this.grade = grade;
		this.point = point;
	}
	
	//getter & setter
	//getter
	public String getName() {
		return name;
	}
	public String getGrade() {
		return grade;
	}
	public int getPoint() {
		return point;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setPoint(int point) {
		this.point = point;
	}

	public abstract double getInterestPoint();
	
	@Override
	public int buy(int price) {
		return price;
	}
}
