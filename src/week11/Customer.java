package week11;

public class Customer {
	private int id;
	private String name;
	private int discount;
	
	public Customer(int id, String name, int discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDiscount() {
		return this.discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	public String toString() {
		return String.format("%s(%d)(%d%%)", this.name, this.id, this.discount);
	}
}
