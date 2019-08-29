package member.model.vo;

public class Gold extends Member{
	//field
	private double interestPoint = 0.05;
	
	//constructor
	public Gold() {
		
	}
	public Gold(String name, String grade, int point) {
		super(name,grade,point);
	}
	public Gold(String name, String grade, int point, double interestPoint) {
		super(name,grade,point);
		this.interestPoint = interestPoint;
	}
	
	//getter & setter
	@Override
	public double getInterestPoint() {
		return interestPoint;
	}
	
	public void setInterestPoint(double interestPoint) {
		this.interestPoint = interestPoint;
	}
}
