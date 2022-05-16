package week11;

public class Invoice {
	private int id;
	private Customer3 customer;
	private double amount;
	
	public Invoice(int id, Customer3 customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	
	public int getID() {
		return this.id;
	}
	
	public Customer3 getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(Customer3 customer) {
		this.customer = customer;
	}
	
	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getCustomerID() {
		return this.customer.getID();
	}
	
	public String getCustomerName() {
		return this.customer.getName();
	}
	
	public int getCustomerDiscount() {
		return this.customer.getDiscount();
	}
	
	public double getAmountAfterDiscount() {
		this.amount = this.amount * (100 - getCustomerDiscount()) / 100;
		return this.amount;
	}
	
	public String toString() {
		return String.format("Invoice[id=%d,customer=%s,amount=%s]", this.id, this.customer.toString(), this.amount);
	}
}
