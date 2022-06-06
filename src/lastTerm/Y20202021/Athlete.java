package lastTerm.Y20202021;

public class Athlete {
	private String name;
	private int year;
	private String sport;
	private double weight = 0.0;
	private double height = 0.0;
	
	public Athlete() {
		
	}
	
	public Athlete(String name) {
		this.name = name;
	}
	
	public Athlete(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public Athlete(String name, int year, String sport) {
		this.name = name;
		this.year = year;
		this.sport = sport;
	}
	
	public Athlete(String name, int year, String sport, double weight) {
		this.name = name;
		this.year = year;
		this.sport = sport;
		this.weight = weight;
	}
	
	public Athlete(String name, int year, String sport, double weight, double height) {
		this.name = name;
		this.year = year;
		this.sport = sport;
		this.weight = weight;
		this.height = height;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSport() {
		return this.sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public String toString() {
		return String.format("Athlete[name=%s,year=%d,sport=%s,weight=%s,height=%s]", name, year, sport, weight, height);
	}
}
