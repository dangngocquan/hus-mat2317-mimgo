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
				int day = Integer.parseInt(scanner.next());
				arrayList.add(Float.parseFloat(scanner.next()));
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
