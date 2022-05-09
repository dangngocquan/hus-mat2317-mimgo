package week10;

public class Account {
	private String id;
	private String name;
	private int balance = 0;
	
	public Account(String newId, String newName) {
		this.id = newId;
		this.name = newName;
	}
	
	public Account(String newId, String newName, int newBalance) {
		this.id = newId;
		this.name = newName;
		this.balance = newBalance;
	}
	
	public String getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	public int credit(int amount) {
		this.balance += amount;
		return this.balance;
	}
	
	public int debit(int amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			return this.balance;
		}else {
			System.out.println("Amount exceeded balance");
			return this.balance;
		}
	}
	
	public int transferTo(Account anotherAccount, int amount) {
		if (amount <= this.balance) {
			this.balance -= amount;
			anotherAccount.balance += amount;
		}else {
			System.out.println("Amount exceeded balance");
		}
		return this.balance;
	}
	
	public String toString() {
		String s = String.format("Account[id=%s,name=%s,balance=%d]", this.id, this.name, this.balance);
		return s;
	}
}
