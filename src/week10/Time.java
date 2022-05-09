package week10;

public class Time {
	private int hour, minute, second;
	
	public Time(int newHour, int newMinute, int newSecond) {
		this.hour = newHour;
		this.minute = newMinute;
		this.second = newSecond;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public int getSecond() {
		return this.second;
	}
	
	public void setHour(int newHour) {
		this.hour = newHour;
	}
	
	public void setMinute(int newMinute) {
		this.minute = newMinute;
	}
	
	public void setSecond(int newSecond) {
		this.second = newSecond;
	}
	
	public void setTime(int newHour, int newMinute, int newSecond) {
		this.hour = newHour;
		this.minute = newMinute;
		this.second = newSecond;
	}
	
	public String toString() {
		String s = String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
		return s;
	}
	
	public Time nextSecond() {
		second++;
		if (second == 60) {
			second = 0;
			minute++;
			if (minute == 60) {
				minute = 0;
				hour++;
				if (hour == 24) {
					hour = 0;
				}
			}
		}
		Time ansTime = new Time(hour, minute, second);
		return ansTime;
	}
	
	public Time previousSecond() {
		second--;
		if (second == -1) {
			second = 59;
			minute--;
			if (minute == -1) {
				minute = 59;
				hour--;
				if (hour == -1) {
					hour = 23;
				}
			}
		}
		Time ansTime = new Time(hour, minute, second);
		return ansTime;
	}
}
