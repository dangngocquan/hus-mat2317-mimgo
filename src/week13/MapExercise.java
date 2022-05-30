package week13;

import java.util.*;

/**
* You can find many more here:
* https://www.w3resource.com/java-exercises/collection/index.php
*/
public class MapExercise {
	/**
	* %*\textcolor{lincolngreen}{Write a function to return the number of key-value mappings of a  map}*)
	*/
	public static int count(Map<Integer, Integer> map) {
		return map.size();
	}
	
	/**
	* Write a function to remove all mappings from a map
	*/
	public static void empty(Map<Integer, Integer> map) {
		map.clear();
	}
	
	/**
	* %*\textcolor{lincolngreen}{Write a function to test if a map contains a mapping for the specified key}*)
	*/
	public static boolean contains(Map<Integer, Integer> map, int key) {
		return map.containsKey(key);
	}
	
	/**
	* Write a function to test if a map contains a mapping for 
	* the specified key and if its value equals the
	* specified value
	*/
	public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
		return map.containsKey(key) && map.get(key) == value;
	}
	
	/**
	* Write a function to return the key set of map
	*/
	public static Set<Integer> keySet(Map<Integer, Integer> map) {
		return  map.keySet();
	}
	
	/**
	* Write a function to return the values of a map
	*/
	public static Collection<Integer> values(Map<Integer, Integer> map) {
		List<Integer> list  = new LinkedList<Integer>();
		for  (int key :   map.keySet()) {
			list.add(map.get(key));
		}
		return list;
    }
	
	/**
	* Write a function, internally using a map, returning "black", 
	* "white", or "red" depending on int input value.
	* "black" = 0, "white" = 1, "red" = 2
	*/
	public static String getColor(int value) {
		switch (value) {
		case 0:
			return "black";
		case 1:
			return "white";
		case 2:
			return "red";
		}
		return "";
	}
}