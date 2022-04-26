package week09;

import java.util.Scanner;

/**
 * 1d array program 
 */
 
public class Array1D {
    public static void main (String[] args) {
         /* Code test */
    }
    
    public static int[] inputArray(int size, Scanner keyboard) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
        	arr[i] = keyboard.nextInt();
        }
        return arr;
    }
     
    public static String arrayToString(int[] array) {
        if (array.length == 0) {
            return "[]";
        }
        String s = "[";
        for (int element: array) {
        	s += element + ",";
        }
        s = s.substring(0,s.length()-1) + "]";
        return s;
    } 
    
    public static int[] copyOf(int[] array) {
        int[] arr = new int[array.length];
        for (int i = 0; i < arr.length; i++) {
        	arr[i] = array[i];
        }
        return arr;
    }
    
    public static void sort(int[] array) {
        for (int turn = 0; turn < array.length; turn++) {
        	for (int i = 0; i < array.length - 1; i++) {
        		if (array[i] > array[i+1]) {
        			int temp = array[i];
        			array[i] = array[i+1];
        			array[i+1] = temp;
        		}
        	}
        }
    }
    
    public static int search(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
        	if (array[i] == value) {
        		return i;
        	}
        }
        return -1;
    }
    
    public static boolean contains(int[] array, int value) {
        int[] a = copyOf(array);
        sort(a);
        int leftIndex = 0;
        int rightIndex = a.length - 1;
        while (leftIndex <= rightIndex) {
        	int midIndex = (leftIndex + rightIndex) / 2;
        	if (a[midIndex] == value) {
        		return true;
        	}else if (value > a[midIndex]){
        		leftIndex = midIndex + 1;
        	}else {
        		rightIndex = midIndex - 1;
        	}
        }
        return false;
    }
}
