package week10;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;
	
	public Rectangle() {
		
	}
	
	public Rectangle(float newLength, float newWidth) {
		this.length = newLength;
		this.width = newWidth;
	}
	
	public float getLength() {
		return length;
	}
	
	public void setLength(float newLength) {
		this.length = newLength;
	}
	
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float newWidth) {
		this.width = newWidth;
	}
	
	public double getArea() {
		return (double)(length * width);
	}
	
	public double getPerimeter() {
		return (double)(2 * length + 2 * width);
	}
	
	public String toString() {
		String s = String.format("Rectangle[length=%s,width=%s]", length, width);
		return s;
	}
}
