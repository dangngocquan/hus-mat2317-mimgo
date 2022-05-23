package week12;

public class Circle {
	private double radius = 1.0;
	private String color = "red";
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public String toString() {
		return String.format("Circle[radius=%s,color=%s]", this.radius, this.color);
	}
}
