package week11;

public class MyComplex {
	private double real = 0.0;
	private double imag = 0.0;
	
	public MyComplex() {
		
	}
	
	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal() {
		return this.real;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public double getImag() {
		return this.imag;
	}
	
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String toString() {
		return String.format("(%s + %si)", this.real, this.imag);
	}
	
	public boolean isReal() {
		return (this.imag == 0.0);
	}
	
	public boolean isImaginary() {
		return (this.real == 0.0);
	}
	
	public boolean equals(double real, double imag) {
		return (this.real == real && this.imag == imag);
	}
	
	public boolean equals(MyComplex another) {
		return (this.real == another.real && this.imag == another.imag);
	}
	
	public double magnitude() {
		return Math.sqrt(this.real * this.real + this.imag * this.imag);
	}
	
	public MyComplex addInto(MyComplex right) {
		this.real += right.getReal();
		this.imag += right.getImag();
		return this;
	}
	
	public MyComplex addNew(MyComplex right) {
		return new MyComplex(this.real + right.real, this.imag + right.imag);
	}
	
}
