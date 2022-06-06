package lastTerm.Y20202021;

import java.io.IOException;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) throws IOException {
		ArrayList<Athlete> arrayAthlete = AthleteManager.readFile("D:\\Study\\Java\\WithEclipse\\MIMGOMAT2317\\src\\lastTerm\\Y2021\\athletes.txt");
		AthleteManager.sort(arrayAthlete);
		AthleteManager.printBMIs(arrayAthlete);
		System.out.println();
		AthleteManager.print(AthleteManager.findAthlete(arrayAthlete));
	}
	
}
