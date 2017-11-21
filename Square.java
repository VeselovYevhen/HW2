package HW;

public class Square extends Shape {

	private Point center;
	private double pointA;
			
	public Square(double x, double y, double pointA) {
		super();
		this.center = new Point();
		this.pointA = pointA;
				
	}
	@Override
	double getPerimetr() {
		return 4*pointA;
	}
	@Override
	double getArea() {
		return pointA*pointA;
	}
	
	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public double getPointA() {
		return pointA;
	}
	
	public void setPointA(double pointA) {
		this.pointA = pointA;
	}
	
	
}
