package week12;

public class Circle5 extends Shape {
	private double radius = 1.0;
	
	public Circle5() {
	}
	
	public Circle5(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle5(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return String.format("Circle[Shape[color=%s,filled=%s],radius=%s]", this.getColor() , this.isFilled(), this.radius);
	}
}
