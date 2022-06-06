package lastTerm.Y20192020.exercise02;

public class Footballer {
	private String name;
	private int number;
	private int height ;
	private int weight;
	private double bmi;
	private int location;
	
	//Contructor
	public Footballer() {
		
	}
	
	public Footballer(String name) {
		this.name = name;
	}
	
	public Footballer(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public Footballer(String name, int number, int height) {
		this.name = name;
		this.number = number;
		this.height = height;
	}
	
	public Footballer(String name, int number, int height, int weight) {
		this.name = name;
		this.number = number;
		this.height = height;
		this.weight = weight;
	}
	
	public Footballer(String name, int number, int height, int weight, double bmi) {
		this.name = name;
		this.number = number;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
	}
	
	public Footballer(String name, int number, int height, int weight, double bmi, int location) {
		this.name = name;
		this.number = number;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.location = location;
	}
	
	
	//Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	
	public void setBmi(int height, int weight) {
		setBmi(height * 1.0 / (weight * weight));
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}
	
}
