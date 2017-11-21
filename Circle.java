package HW;

public class Circle extends Shape {
	private Point center;
	private double radius ;
		
	public Circle(double x, double y, double radius) {
		super();
		this.center = new Point();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	@Override
	double getPerimetr() {
		return 2*Math.PI*radius;
	}

	@Override
	double getArea() {
		return Math.PI*radius*radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	

}
