package lastTerm.Y20202021.Code02;

public class MasterStudent extends Student {
	private int no_publications;
	
	public MasterStudent() {
		
	}
	
	public MasterStudent(String id, String name, int age, String email, double GPA) {
		super(id, name, age, email, GPA);
	}
	
	public MasterStudent(String id, String name, int age, String email, double GPA, int no_publications) {
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
		if (super.getGPA() < 3.2) {
			return 500000.0 * no_publications;
		}
		if (super.getGPA() < 3.6) {
			return 1000000.0 + 500000.0 * no_publications;
		}
		return 2000000.0 + 500000.0 * no_publications;
	}
	
	public String toString() {
		return super.toString() + " MasterStudent[no_pub=" + no_publications + ",Bonus=" + String.format("%.0f", getBonus()) + "]";
	}
}
