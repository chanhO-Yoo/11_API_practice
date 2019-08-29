package member.model.vo;

public class Silver extends Member{
	//field
	private double interestPoint = 0.02;
	
	//constructor
	public Silver() {
		
	}
	public Silver(String name, String grade, int point) {
		super(name,grade,point);
	}
	public Silver(String name, String grade, int point, double interestPoint) {
		super(name,grade,point);
		this.interestPoint = interestPoint;
	}
	
	//getter&setter
	@Override
	public double getInterestPoint() {
		return interestPoint;
	}
	
	public void setInterestPoint(double interestPoint) {
		this.interestPoint = interestPoint;
	}
}
