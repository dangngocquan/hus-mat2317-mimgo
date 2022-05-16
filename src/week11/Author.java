package week11;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return String.format("Author[name=%s,email=%s,gender=%s]", this.name, this.email, this.gender);
	}
}
