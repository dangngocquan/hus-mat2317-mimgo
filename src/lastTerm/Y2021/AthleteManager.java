package lastTerm.Y2021;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AthleteManager {
	private static Scanner scanner;
	//1.
	public static ArrayList<Athlete> readFile(String filename) throws IOException {
		ArrayList<Athlete> arrayListAthlete = new ArrayList<Athlete>();
		scanner = new Scanner(new File(filename));
		int numberOfAthlete;
		if (scanner.hasNextLine()) {
			numberOfAthlete = Integer.parseInt(scanner.nextLine());
		}
		while (scanner.hasNextLine()) {
			String name = scanner.nextLine();
			int year = Integer.parseInt(scanner.nextLine());
			String sport = scanner.nextLine();
			double weight = Double.parseDouble(scanner.nextLine());
			double height = Double.parseDouble(scanner.nextLine());
			Athlete athlete = new Athlete(name, year, sport, weight, height);
			arrayListAthlete.add(athlete);
		}
		scanner.close();
		return arrayListAthlete;
	}
	
	//2.
	public static void print(ArrayList<Athlete> aths) {
		for (Athlete athlete : aths) {
			System.out.println(athlete.toString());
		}
	}
	
	//3.
	public static void printBMIs(ArrayList<Athlete> aths) {
		for (Athlete athlete : aths) {
			double bmi = athlete.getWeight() / ((athlete.getHeight() / 100) * (athlete.getHeight() / 100));
			System.out.printf("%.3f\t", bmi);
		}
	}
	
	//4.
	public static ArrayList<Athlete> findSport(ArrayList<Athlete> aths, String sport) {
		ArrayList<Athlete> arrayAnswer = new ArrayList<>();
		for (Athlete athlete : aths) {
			if (athlete.getSport().equals(sport)) {
				arrayAnswer.add(athlete);
			}
		}
		return arrayAnswer;
	}
	
	//5.
	public static ArrayList<Athlete> findAthlete(ArrayList<Athlete> aths) {
		ArrayList<Athlete> arrayHeightestAthlete = new ArrayList<Athlete>();
		
		//find the heightest value
		double maxHeight = 0.0;
		for (Athlete athlete : aths) {
			maxHeight = Math.max(maxHeight, athlete.getHeight());
		}
		
		//find the heightest athlete
		for (Athlete athlete : aths) {
			if (athlete.getHeight() == maxHeight) {
				arrayHeightestAthlete.add(athlete);
			}
		}
		
		return arrayHeightestAthlete;
	}
	
	//6.
	public static void sort(ArrayList<Athlete> aths) {
		//Sort
		for (int turn = 1; turn <= aths.size(); turn++) {
			for (int i = 0; i < aths.size() - 1; i++) {
				//get athlete
				Athlete athlete1 = aths.get(i);
				String fullNameOfAthlete1 = athlete1.getName();
				String[] arrayNameOfAthlete1 = fullNameOfAthlete1.split("\s");
				String firstNameOfAthlete1 = arrayNameOfAthlete1[arrayNameOfAthlete1.length - 1];
				String lastNameOfAthlete1 = fullNameOfAthlete1.substring(0, fullNameOfAthlete1.length() - firstNameOfAthlete1.length() - 1);
				
				//get next athlete
				Athlete athlete2 = aths.get(i+1);
				String fullNameOfAthlete2 = athlete2.getName();
				String[] arrayNameOfAthlete2 = fullNameOfAthlete2.split("\s");
				String firstNameOfAthlete2 = arrayNameOfAthlete2[arrayNameOfAthlete2.length - 1];
				String lastNameOfAthlete2 = fullNameOfAthlete2.substring(0, fullNameOfAthlete2.length() - firstNameOfAthlete2.length() - 1);
				
				//compare
				if (firstNameOfAthlete1.compareTo(firstNameOfAthlete2) > 0) {
					aths.set(i, athlete2);
					aths.set(i+1, athlete1);
				}else if (firstNameOfAthlete1.compareTo(firstNameOfAthlete2) == 0) {
					if (lastNameOfAthlete1.compareTo(lastNameOfAthlete2) > 0) {
						aths.set(i, athlete2);
						aths.set(i+1, athlete1);
					}
				}
			}
		}
		
		//Print
		print(aths);
	}
}
