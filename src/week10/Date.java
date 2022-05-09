package week10;

public class Date {
	private int day, month, year;
	
	public Date(int newDay, int newMonth, int newYear) {
		this.day = newDay;
		this.month = newMonth;
		this.year = newYear;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public void setDay(int newDay) {
		this.day = newDay;
	}
	
	public void setMonth(int newMonth) {
		this.month = newMonth;
	}
	
	public void setYear(int newYear) {
		this.year = newYear;
	}
	
	public void setDate(int newDay, int newMonth, int newYear) {
		this.day = newDay;
		this.month = newMonth;
		this.year = newYear;
	}
	
	public String toString() {
		String s = String.format("%02d/%02d/%04d", this.day, this.month, this.year);
		return s;
	}
}
