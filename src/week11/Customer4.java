package week11;

public class Customer4 {
	private int id;
	private String name;
	private char gender;
	
	public Customer4(int id, String name, char gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getGender() {
		return this.gender;
	}
	
	public String toString() {
		return String.format("%s(%d)", this.name, this.id);
	}
}
