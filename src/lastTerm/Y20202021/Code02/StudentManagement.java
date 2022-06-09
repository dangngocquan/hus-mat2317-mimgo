package lastTerm.Y20202021.Code02;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
	public ArrayList<Student> readData(String fileName) {
		ArrayList<Student> ansList = new ArrayList<>();
		Scanner scanner = null;
		File file = null;
		
		try {
			file = new File(fileName);
			scanner = new Scanner(file);
			int numberOfStudents;
			if (scanner.hasNext()) {
				numberOfStudents = Integer.parseInt(scanner.next());
			}
			while (scanner.hasNext()) {
				int number = Integer.parseInt(scanner.next());
				String id = scanner.next();
				String name = scanner.next();
				int age = Integer.parseInt(scanner.next());
				String email = scanner.next();
				double GPA = Double.parseDouble(scanner.next());
				int no_publications = Integer.parseInt(scanner.next());
				if (number == 1) {
					MasterStudent masterStudent = new MasterStudent(id, name, age, email, GPA, no_publications);
					ansList.add(masterStudent);
				}else {
					PhDStudent phDStudent = new PhDStudent(id, name, age, email, GPA, no_publications);
					ansList.add(phDStudent);
				}
			}
		} catch (IOException e) {
			System.out.println("Error!");
			
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		
		return ansList;
	}
	
	public void printInforStudents(ArrayList<Student> students) {
		for (Student student : students) {
			System.out.println(student.toString());
		}
	}
	
	public void sortByBonus(ArrayList<Student> students) {
		for (int turn = 1; turn <= students.size(); turn++) {
			for (int i = 0; i < students.size() - 1; i++) {
				Student student1 = students.get(i);
				Student student2 = students.get(i+1);
				double bonus1, bonus2;
				
				if (students.get(i).getClass().getSimpleName().equals("MasterStudent")) {
					bonus1 = ((MasterStudent)(student1)).getBonus();
				}else {
					bonus1 = ((PhDStudent)(student1)).getBonus();
				}
				
				if (students.get(i+1).getClass().getSimpleName().equals("MasterStudent")) {
					bonus2 = ((MasterStudent)(student2)).getBonus();
				}else {
					bonus2 = ((PhDStudent)(student2)).getBonus();
				}
				
				if (bonus1 > bonus2) {
					students.set(i, student2);
					students.set(i+1, student1);
				}
			}
		}
	}
	
	public ArrayList<Student> filterMS_byBonus(ArrayList<Student> students, String faculty) {
		ArrayList<Student> ansList = new ArrayList<>();
		ArrayList<Student> masterStudentList = new ArrayList<>();
		double sumBonus = 0.0;
		for (Student student : students) {
			if (student.getFaculty().equals(faculty) && student.getClass().getSimpleName().equals("MasterStudent")) {
				sumBonus += ((MasterStudent)(student)).getBonus();
				masterStudentList.add(student);
			}
		}
		
		double averageBonus = (masterStudentList.size() > 0)? sumBonus / masterStudentList.size() : 0.0;
		
		for (Student student : masterStudentList) {
			if (((MasterStudent)student).getBonus() > averageBonus) {
				ansList.add(student);
			}
		}
		
		sortByBonus(ansList);
		
		return ansList;
	}
	
	public ArrayList<Student> filterPhD_byNoPub(ArrayList<Student> students) {
		ArrayList<Student> ansList = new ArrayList<>();
		
		//find sum of no_publications and average 
		int sumNoPub = 0;
		for (Student student : students) {
			if (student.getClass().getSimpleName().equals("MasterStudent")) {
				sumNoPub += ((MasterStudent)(student)).getNo_publications();
			}else {
				sumNoPub += ((PhDStudent)(student)).getNo_publications();
			}
		}
		
		double averageNoPub = (students.size() > 0)? sumNoPub * 1.0 / students.size() : 0.0;
		
		//find student who is PhDStudent and has no_publications > averageNoPub
		for (Student student : students) {
			if (student.getClass().getSimpleName().equals("PhDStudent") && ((PhDStudent)(student)).getNo_publications() > averageNoPub) {
				ansList.add(student);
			}
		}
		
		//sort by Desc
		for (int turn = 1; turn <= ansList.size(); turn++) {
			for (int i = 0; i < ansList.size() - 1; i++) {
				Student student1 = ansList.get(i);
				int noPub1 = ((PhDStudent)(student1)).getNo_publications();
				
				Student student2 = ansList.get(i+1);
				int noPub2 = ((PhDStudent)(student2)).getNo_publications();
				
				if (noPub1 < noPub2) {
					ansList.set(i, student2);
					ansList.set(i+1, student1);
				}
			}
		}
		
		return ansList;
	}
}
