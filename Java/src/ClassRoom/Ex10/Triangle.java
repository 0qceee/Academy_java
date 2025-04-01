package ClassRoom.Ex10;

public class Triangle {
	private double width;
	private double height;
	
	public Triangle() {
	}

	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		double s = (width*height)/2;
		return s;
	}

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
}
