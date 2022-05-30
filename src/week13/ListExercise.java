package week13;

import java.util.*;

public class ListExercise {
	/**
	* Write a function to insert an element into a list at the beginning
	*/
	public static void insertFirst(ArrayList<Integer> list, int value) {
		list.add(0, value);
	}
	
	/**
	* Write a function to insert an element into a list at the end
	*/
	public static void insertLast(ArrayList<Integer> list, int value) {
		list.add(value);
	}
	
	/**
	* %*\textcolor{lincolngreen}{Write a function to replace the 3rd element of a list with a given value}*)
	*/
	public static void replace(ArrayList<Integer> list, int value) {
		list.set(2, value);
	}
	
	/**
	* Write a function to remove the 3rd element from a list
	*/
	public static void removeThird(ArrayList<Integer> list) {
		list.remove(2);
	}
	
	/**
	* Write a function to remove the element "666" from a list
	*/
	public static void removeEvil(ArrayList<Integer> list) {
		list.remove(Integer.valueOf(666));
	}
	
	/**
	* Write a function returning a ArrayList<Integer> containing
	* the first 10 square numbers (i.e., 1, 4, 9, 16, ...)
	*/
	public static ArrayList<Integer> generateSquare() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i * i);
		}
		return list;
	}
	
	/**
	* Write a function to verify if a list contains a certain value
	*/
	public static boolean contains(ArrayList<Integer> list, int value) {
		for (int element : list) {
			if (element == value) {
				return true;
			}
		}
		return false;
	}
	
	/**
	* %*\textcolor{lincolngreen}{Write a function to copy a list into another list (without using library functions)}*)
	* Note well: the target list must be emptied before the copy
	*/
	public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
		target.clear();
		for (int element : source) {
			target.add(element);
		}
	}
	
	/**
	* Write a function to reverse the elements of a list
	*/
	public static void reverse(ArrayList<Integer> list) {
		Collections.reverse(list);
	}
	
	/**
	* %*\textcolor{lincolngreen}{Write a function to reverse the elements of a list (without using library functions)}*)
	*/
	public static void reverseManual(ArrayList<Integer> list) {
		ArrayList<Integer> tempList = new ArrayList<>(list);
		list.clear();
		for (int i = tempList.size() - 1; i >= 0; i--) {
			list.add(tempList.get(i));
		}
	}
	
	/**
	* Write a function to insert the same element both at the 
	* beginning and the end of the same LinkedList
	* Note well: you can use LinkedList specific methods
	*/
	public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
		list.add(0, value);
		list.add(value);
	}
}
