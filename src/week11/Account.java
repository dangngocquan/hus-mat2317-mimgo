package week11;

public class Account {
	private int id;
	private Customer4 customer;
	private double balance = 0.0;
	
	public Account(int id, Customer4 customer, double balance) {
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	
	public Account(int id, Customer4 customer) {
		this.id = id;
		this.customer = customer;
	}
	
	public int getID() {
		return this.id;
	}
	
	public Customer4 getCustomer() {
		return this.customer;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return String.format("%s balance=$%.2f", customer.toString(), this.balance);
	}
	
	public String getCustomerName() {
		return this.customer.getName();
	}
	
	public Account deposit(double amount) {
		this.balance += amount;
		return this;
	}
	
	public Account withdraw(double amount) {
		if (balance >= amount) {
			this.balance -= amount;
		}else {
			System.out.println("amount withdraw exceeds the current balance!");
		}
		return this;
	}
}
