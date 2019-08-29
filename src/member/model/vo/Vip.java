package member.model.vo;

public class Vip extends Member {
	//field
	private double interestPoint = 0.1;
	
	//constructor
	public Vip() {
		
	}
	public Vip(String name, String grade, int point) {
		super(name, grade, point);
	}
	public Vip(String name, String grade, int point, double interestPoint) {
		super(name, grade, point);
		this.interestPoint = interestPoint;
	}
	
	//getter & setter
	@Override
	public double getInterestPoint() {
		return interestPoint;
	}
	public void getInterestPoint(double interestPoint) {
		this.interestPoint = interestPoint;
	}
}
