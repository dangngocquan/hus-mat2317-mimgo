package week10;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int newId, String newFirstName, String newLastName, int newSalary) {
		this.id = newId;
		this.firstName = newFirstName;
		this.lastName = newLastName;
		this.salary = newSalary;
	}
	
	public int getID() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int newSalary) {
		this.salary = newSalary;
	}
	
	public int getAnnualSalary() {
		return salary * 12;
	}
	
	public int raiseSalary(int percent) {
		int newSalary = salary + (int)(salary * percent * 1.0 / 100);
		this.salary = newSalary;
		return newSalary;
	}
	
	public String toString() {
		String s = String.format("Employee[id=%d,name=%s,salary=%d]", id, getName(), salary);
		return s;
	}
}
