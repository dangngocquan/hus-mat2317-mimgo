package week09;

import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		scanner.close();
		
		int hour = s/3600;
		int minute = (s- hour*3600)/60;
		int second = s - hour*3600 - minute*60;
		
		System.out.printf("%d:%d:%d", hour, minute, second);
	}
}