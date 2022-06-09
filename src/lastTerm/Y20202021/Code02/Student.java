package lastTerm.Y20202021.Code02;

public class Student {
	private String id;
	private String name;
	private int age;
	private String email;
	private double GPA;
	
	public Student() {
		
	}
	
	public Student(String id) {
		this.id = id;
	}
	
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Student(String id, String name, int age, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public Student(String id, String name, int age, String email, double GPA) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
		this.GPA = GPA;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public double getGPA() {
		return this.GPA;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	public String getFaculty() {
		String roomName = (email.contains("@sosci."))? "Khoa Khoa học xã hội" : "Khoa Khoa học tự nhiên";
		return roomName;
	}
	
	
}
