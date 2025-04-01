package ClassRoom.Ex10;

public class Circle {

	private double radius;

	// 기본 생성자
	public Circle() {
	}
	
	// 매개변수가 있는 생성자
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// getter setter
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// 넓이 공식
	public double getArea() {
		double s = radius*radius*Math.PI;
		return s;
	}
	
	// toString
	@Override
	public String toString() {
		return  "Circle [radius=" + radius + "]";
	}
	
	
}