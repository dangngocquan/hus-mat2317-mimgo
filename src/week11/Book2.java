package week11;

public class Book2 {
	private String name;
	private Author2[] author;
	private double price;
	private int qty = 0;
	
	public Book2(String name, Author2[] author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public Book2(String name, Author2[] author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Author2[] getAuthors() {
		return this.author;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQty() {
		return this.qty;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString() {
		String ans = "";
		ans += "Book[name=" + this.name + ",author={";
		for (int i = 0; i < author.length; i++) {
			ans += author[i].toString() + ",";
		}
		ans = ans.substring(0,ans.length()-1);
		ans += "},price=" + this.price + ",qty=" + this.qty + "]";
		return ans;
	}
	
	public String getAuthorNames() {
		String ans = "";
		for (int i = 0; i < author.length; i++) {
			ans += author[i].getName() + ",";
		}
		return ans.substring(0,ans.length()-1);
	}
}
