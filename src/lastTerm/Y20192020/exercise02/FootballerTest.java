package lastTerm.Y20192020.exercise02;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FootballerTest {
	public static ArrayList<Footballer> readData(String fileName) {
		File file = null;
		Scanner scanner = null;
		ArrayList<Footballer> arrayList = null;
		try {
			file = new File(fileName);
			scanner = new Scanner(file);
			arrayList = new ArrayList<Footballer>();
			
			int numberOfFootballer = 0;
			if (scanner.hasNext()) {
				numberOfFootballer = Integer.parseInt(scanner.nextLine());
			}
			
			while (scanner.hasNextLine()) {
				String name = scanner.nextLine();
				int number = Integer.parseInt(scanner.nextLine());
				int height = Integer.parseInt(scanner.nextLine());
				int weight = Integer.parseInt(scanner.nextLine());
				int location = Integer.parseInt(scanner.nextLine());
				Footballer footballer = new Footballer(name, number, height, weight, height*1.0 / (weight * weight), location);
				arrayList.add(footballer);
			}
		} catch (IOException err) {
			System.out.println("Error!");
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		
		return arrayList;
	}
	
	public static void sort(ArrayList<Footballer> footballers) {
		for (int turn = 1; turn <= footballers.size(); turn++) {
			for (int i = 0; i < footballers.size() - 1; i++) {
				Footballer footballer1 = footballers.get(i);
				int weigth1 = footballer1.getWeight();
				
				Footballer footballer2 = footballers.get(i+1);
				int weigth2 = footballer2.getWeight();
				
				if (weigth1 > weigth2) {
					footballers.set(i, footballer2);
					footballers.set(i+1, footballer1);
				}
			}
		}
	}
	
	public static ArrayList<Integer> find(ArrayList<Footballer> footballers, int number) {
		//Find the footballer who having number == 'number'
		Footballer footballerChecking = null;
		for (Footballer footballer : footballers) {
			if (footballer.getNumber() == number) {
				footballerChecking = footballer;
				break;
			}
		}
		
		if (footballerChecking == null) {
			return null;
		}else {
			if (footballerChecking.getLocation() == 1 || footballerChecking.getLocation() == 2) {
				return null;
			}
		}
		
		//Find ansList
		ArrayList<Integer> ansList = new ArrayList<Integer>();
		for (Footballer footballer : footballers) {
			footballer.setBmi(footballer.getHeight(), footballer.getWeight());
		}
		
		double minAbs = Double.MAX_VALUE;
		for (Footballer footballer : footballers) {
			if (footballer.getNumber() == number) {
				continue;
			}
			minAbs = Math.min(minAbs, Math.abs(footballerChecking.getBmi() - footballer.getBmi()));
		}
		
		for (Footballer footballer : footballers) {
			double abs = Math.abs(footballerChecking.getBmi() - footballer.getBmi());
			if (abs == minAbs && Math.abs(footballerChecking.getWeight() - footballer.getWeight()) <= 6) {
				ansList.add(footballer.getNumber());
			}
		}
		
		if (ansList.size() == 0) {
			return null;
		}else {
			return ansList;
		}
	}
}
