package member.model.vo;

public class Ruby extends Member{
	//field
	private double interestPoint = 0.3;
	
	//constructor
	public Ruby() {
		
	}
	public Ruby(String name, String grade, int point) {
		super(name, grade, point);
	}
	public Ruby(String name, String grade, int point, double interestPoint) {
		super(name, grade, point);
		this.interestPoint = interestPoint;
	}
	
	//getter & setter
	@Override
	public double getInterestPoint() {
		return interestPoint;
	}
	public void setInterestPoint(double interestPoint)
	{
		this.interestPoint = interestPoint;
	}
}
