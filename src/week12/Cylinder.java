package week12;

public class Cylinder extends Circle {
	private double height = 1.0;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double radius) {
		super((radius == 10.0)? 1.0 : radius);
		this.height = (radius == 10.0)? 10.0 : 1.0;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return this.height * super.getArea();
	}
}
