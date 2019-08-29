package member.model.vo;

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
