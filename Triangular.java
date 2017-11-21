package HW;

public class Triangular extends Shape {
	private Point center;
	private double pointA;
	private double pointB;
	private double pointC;
	
	
	public Triangular(double x, double y, double pointA, double pointB, double pointC) {
		super();
		this.center = new Point(x, y);
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
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


	public double getPointB() {
		return pointB;
	}


	public void setPointB(double pointB) {
		this.pointB = pointB;
	}


	public double getPointC() {
		return pointC;
	}


	public void setPointC(double pointC) {
		this.pointC = pointC;
	}


	@Override
	double getPerimetr() {
		return pointA + pointB + pointC;
	}

	@Override
	double getArea() {
		double p = (pointA + pointB + pointC)/2;
		return Math.sqrt(p*(p-pointA)*(p-pointB)*(p-pointC));
	}
	

}
