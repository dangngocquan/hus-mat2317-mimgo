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
		this.second++;
		if (this.second == 60) {
			this.second = 0;
			this.minute++;
			if (this.minute == 60) {
				this.minute = 0;
				this.hour++;
				if (this.hour == 24) {
					this.hour = 0;
				}
			}
		}
		return this;
	}
	
	public Time previousSecond() {
		this.second--;
		if (this.second == -1) {
			this.second = 59;
			this.minute--;
			if (this.minute == -1) {
				this.minute = 59;
				this.hour--;
				if (this.hour == -1) {
					this.hour = 23;
				}
			}
		}
		
		return this;
	}
}
