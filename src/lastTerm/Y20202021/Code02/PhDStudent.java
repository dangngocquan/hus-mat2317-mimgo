package lastTerm.Y20202021.Code02;

public class PhDStudent extends Student {
	private int no_publications;
	
	public PhDStudent() {
		
	}
	
	public PhDStudent(String id, String name, int age, String email, double GPA) {
		super(id, name, age, email, GPA);
	}
	
	public PhDStudent(String id, String name, int age, String email, double GPA, int no_publications) {
		super(id, name, age, email, GPA);
		this.no_publications = no_publications;
	}
	
	public int getNo_publications() {
		return this.no_publications;
	}

	public void setNo_publications(int no_publications) {
		this.no_publications = no_publications;
	}
	
	public double getBonus() {
		return (super.getFaculty().equals("Khoa Khoa học tự nhiên"))? 2000000.0 * no_publications : 3000000.0 * no_publications;
	}
	
	public String toString() {
		return super.toString() + " PhDStudent[no_pub=" + no_publications + ",Bonus=" + String.format("%.0f", getBonus()) + "]";
	}
}
