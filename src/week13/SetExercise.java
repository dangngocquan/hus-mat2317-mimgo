package week13;

import java.util.*;

public class SetExercise {
	/**
	* Write a function returning the intersection of two given sets 
	* (without using library functions)
	*/
	public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
		Set<Integer> set = new LinkedHashSet<Integer>(first);
		for (int element : set) {
			if (!second.contains(element)) {
				set.remove(Integer.valueOf(element));
			}
		}
		return set;
	}
	
	/**
	* Write a function returning the union of two given sets 
	* (without using library functions)
	*/
	public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
		Set<Integer> set = new LinkedHashSet<Integer>(first);
		for (int element : second) {
			set.add(element);
		}
		return set;
	}
	
	/**
	* %*\textcolor{lincolngreen}{Write a function returning the intersection of two given sets (see retainAll())}*)
	*/
	public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
		Set<Integer> set = new LinkedHashSet<Integer>(first);
		set.retainAll(second);
		return set;
	}
	
	/**
	* %*\textcolor{lincolngreen}{Write a function returning the union of two given sets (see addAll())}*)
	*/
	public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
		Set<Integer> set = new LinkedHashSet<Integer>(first);
		set.addAll(second);
		return set;
	}
	
	/**
	* Write a function to transform a set into a list without duplicates
	* Note well: collections can be created from another collection!
	*/
	public static List<Integer> toList(Set<Integer> source) {
		List<Integer> list = new ArrayList<Integer>(source);
		return list;
	}
	
	/**
	* Write a function to remove duplicates from a list
	* Note well: collections can be created from another collection!
	*/
	public static List<Integer> removeDuplicates(List<Integer> source) {
		Set<Integer> set = new LinkedHashSet<Integer>(source);
		List<Integer> list = new LinkedList<Integer>(set);
		return list;
	}
	
	/**
	* Write a function to remove duplicates from a list 
	* without using the constructors trick seen above
	*/
	public static List<Integer> removeDuplicatesManual(List<Integer> source) {
		List<Integer> list = new LinkedList<Integer>();
		for (int element : source) {
			if (!list.contains(element)) {
				list.add(element);
			}
		}
		return list;
	}
	
	/**
	* Write a function accepting a string s
	* returning the first recurring character
	* For example firstRecurringCharacter("abaco") -> a.
	*/
	public static String firstRecurringCharacter(String s) {
		return s.charAt(0) + "";
	}
	
	/**
	* Write a function accepting a string s, 
	* and returning a set comprising all recurring characters.
	* For example allRecurringChars("mamma") -> [m, a].
	*/
	public static Set<Character> allRecurringChars(String s) {
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		return set;
	}
	
	/**
	* Write a function to transform a set into an array
	*/
	public static Integer[] toArray(Set<Integer> source) {
		Integer[] array = new Integer[source.size()];
		int index = 0;
		for (int element : source) {
			array[index] = element;
			index++;
		}
		return array;
	}
	
	/**
	* Write a function to return the first item from a TreeSet
	* Note well: use TreeSet specific methods
	*/
	public static int getFirst(TreeSet<Integer> source) {
		return source.first();
	}
	
	/**
	* Write a function to return the last item from a TreeSet
	* Note well: use TreeSet specific methods
	*/
	public static int getLast(TreeSet<Integer> source) {
		return source.last();
	}
	
	/**
	* Write a function to get an element from a TreeSet 
	* which is strictly greater than a given element.
	* Note well: use TreeSet specific methods
	*/
	public static int getGreater(TreeSet<Integer> source, int value) {
		return source.higher(value);
	}
}
