package week14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;

public class CandidateManager {
    
    private ArrayList<Candidate> candidates;
    
    public CandidateManager() {
        this.candidates = new ArrayList<>();
    }
    
    /*
    * readData
    * Đọc dữ liệu từ file văn bản textFile và lưu dữ liệu vào các biến thành viên
    */
    public boolean readData(String textFile) {
        File file = null;
        Scanner fileReader = null;
        try {
            file = new File(textFile);
            fileReader = new Scanner(file);
            
            while (fileReader.hasNextLine()) {
                String[] fields = fileReader.nextLine().trim().split("\\|");
                if (fields.length != 6) {
                    continue;
                }
                
                String id = fields[0].trim();
                String name = fields[1].trim();
                String selection = fields[2].trim();
                String sex = fields[3].trim();
                int year = Integer.parseInt(fields[4].trim());
                int priority = Integer.parseInt(fields[5].trim());
                
                Candidate newCandidate = new Candidate(id, name, selection, sex, year, priority);
                
                this.candidates.add(newCandidate);
            }
            return true;
        } catch(IOException ex) {
            System.out.println("Error reading file '" + textFile + "'");
            return false;
        }  finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
    
    /* 
    * getSelectionCandicates 
    * Trả về danh sách các thí sinh có khối thi là selection 
    */
    public ArrayList<Candidate> getSelectionCandicates(String selection) { 
        ArrayList<Candidate> ansList = new ArrayList<>();
        for (Candidate candidate : candidates) {
        	if (candidate.selection().equals(selection)) {
        		ansList.add(candidate);
        	}
        }
        return ansList;
    }
    
    /* 
    * getPriorityCandidates 
    * Trả về danh sách thí sinh được ưu tiên (có độ ưu tiên bằng 1)
    */
    public ArrayList<Candidate> getPriorityCandidates() {
    	ArrayList<Candidate> ansList = new ArrayList<>();
        for (Candidate candidate : candidates) {
        	if (candidate.priority() == 1) {
        		ansList.add(candidate);
        	}
        }
        return ansList;
    }
    
    /* 
    * sortByName
    * Trả về danh sách các thí sinh được sắp xếp theo họ và tên
    */
    public ArrayList<Candidate> sortByName() {
    	ArrayList<Candidate> ansList = new ArrayList<>(candidates);
        for (int turn = 1; turn <= ansList.size(); turn++) {
        	for (int i = 0; i < ansList.size()-1; i++) {
        		Candidate candidate1 = ansList.get(i);
        		String fullName1 = candidate1.name();
//        		String[] arrayName1 = fullName1.split(" ");
//        		String firstName1 = arrayName1[arrayName1.length - 1];
//        		String lastName1 = fullName1.substring(0,fullName1.length() - firstName1.length()).trim();
        		
        		Candidate candidate2 = ansList.get(i+1);
        		String fullName2 = candidate2.name();
//        		String[] arrayName2 = fullName2.split(" ");
//        		String firstName2 = arrayName2[arrayName2.length - 1];
//        		String lastName2 = fullName2.substring(0,fullName2.length() - firstName2.length()).trim();
        		
//        		if (firstName1.compareTo(firstName2) > 0) {
//        			ansList.set(i, candidate2);
//        			ansList.set(i+1,candidate1);
//        		}else if (firstName1.compareTo(firstName2) == 0) {
//        			if (lastName1.compareTo(lastName2) > 0) {
//        				ansList.set(i, candidate2);
//            			ansList.set(i+1,candidate1);
//        			}
//        		}
        		
        		if (fullName1.compareTo(fullName2) > 0) {
        			ansList.set(i, candidate2);
        			ansList.set(i+1, candidate1);
        		}
        	}
        }
        return ansList;
    }
    
    /* 
    * getSecondYoungestCandidates 
    * Trả về danh sách các thí sinh có tuổi trẻ thứ 2 trong danh sách 
    *  (ví dụ: các khách hàng có các năm sinh 1990 1991 1992 1993, 
    *  trả về danh sách các khách hàng sinh năm 1992)
    */
    public ArrayList<Candidate> getSecondYoungestCandidates() {
        int maxYear = 0;
        for (Candidate candidate : candidates) {
        	maxYear = Math.max(maxYear, candidate.year());
        }
        
        int secondMaxYear = 0;
        for (Candidate candidate : candidates) {
        	if (candidate.year() < maxYear) {
        		secondMaxYear = Math.max(candidate.year(), secondMaxYear);
        	}
        }
        
        ArrayList<Candidate> ansList = new ArrayList<>();
        for (Candidate candidate : candidates) {
        	if (candidate.year() == secondMaxYear) {
        		ansList.add(candidate);
        	}
        }
        return ansList;
    }
    
    /*
    * printCandidatesFromArray
    * In danh sách các thí sinh từ một List đã cho
    */
    public void printCandidatesFromArray(ArrayList<Candidate> candidates) {
        if (candidates == null) {
            return;
        }
        
        for (int i = 0; i < candidates.size(); i++) {
            candidates.get(i).print();
        }
    }
    
    /*
    * printCandidates 
    * In danh sách các thí sinh được lưu trong biến thành viên candidates
    */
    public void printCandidates() {
        printCandidatesFromArray(this.candidates);
    }
    
    public static void main(String[] args) {
        CandidateManager candidateManager = new CandidateManager();
        if (!candidateManager.readData("candidates.txt")) {
            return;
        }
            
        //ArrayList<Candidate> selectionCandidates = candidateManager.getSelectionCandicates("A");
        //candidateManager.printCandidatesFromArray(selectionCandidates);
        //System.out.println();
        
        //ArrayList<Candidate> priorityCandidates = candidateManager.getPriorityCandidates();
        //candidateManager.printCandidatesFromArray(priorityCandidates);
        //System.out.println();
            
        //ArrayList<Candidate> sortedNameCandidates = candidateManager.sortByName();
        //candidateManager.printCandidatesFromArray(sortedNameCandidates);
        //System.out.println();
            
        //ArrayList<Candidate> secondYoungestCandidates = candidateManager.getSecondYoungestCandidates();
        //candidateManager.printCandidatesFromArray(secondYoungestCandidates);
    }
}