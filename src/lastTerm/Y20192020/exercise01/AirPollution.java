package lastTerm.Y20192020.exercise01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AirPollution {
	public static float[] readData(String fileName) {
		File file = null;
		Scanner scanner = null;
		float[] pm = null;
		
		try {
			file = new File(fileName);
			scanner = new Scanner(file);
			ArrayList<Float> arrayList = new ArrayList<Float>();
			while (scanner.hasNextLine()) {
				ArrayList<String> inputList = new ArrayList<String>();
				while (scanner.hasNext()) {
					inputList.add(scanner.next());
				}
				
				for (int i = inputList.size() / 2; i < inputList.size(); i++) {
					arrayList.add(Float.parseFloat(inputList.get(i)));
				}
			}
			
			pm = new float[arrayList.size()];
			for (int i = 0; i < pm.length; i++) {
				pm[i] = arrayList.get(i);
			}
			
		} catch (IOException err) {
			System.out.println("Error");
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		
		return pm;
	}
	
	public static void replace(float[] pm) {
		float sum = 0.0f;
		int countSmallerOrEquals100 = 0;
		
		for (float element : pm) {
			if (element <= 100) {
				sum += element;
				countSmallerOrEquals100++;
			}
		}
		
		float average;
		if (countSmallerOrEquals100 > 0) {
			average = sum / countSmallerOrEquals100;
		}else {
			average = 0.0f;
		}
		
		for (int i = 0; i < pm.length; i++) {
			if (pm[i] > 100) {
				pm[i] = average;
			}
		}
	}
}
