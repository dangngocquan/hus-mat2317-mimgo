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
		int tempHour = hour;
		int tempMinute = minute;
		int tempSecond = second;
		tempSecond++;
		if (tempSecond == 60) {
			tempSecond = 0;
			tempMinute++;
			if (tempMinute == 60) {
				tempMinute = 0;
				tempHour++;
				if (tempHour == 24) {
					tempHour = 0;
				}
			}
		}
		Time ansTime = new Time(tempHour, tempMinute, tempSecond);
		return ansTime;
	}
	
	public Time previousSecond() {
		int tempHour = hour;
		int tempMinute = minute;
		int tempSecond = second;
		tempSecond--;
		if (tempSecond == -1) {
			tempSecond = 59;
			tempMinute--;
			if (tempMinute == -1) {
				tempMinute = 59;
				tempHour--;
				if (tempHour == -1) {
					tempHour = 23;
				}
			}
		}
		Time ansTime = new Time(tempHour, tempMinute, tempSecond);
		return ansTime;
	}
}
