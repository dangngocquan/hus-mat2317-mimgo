package week08;

import java.util.Arrays;
import java.util.Scanner;

public class Array1D {
    public static void main (String[] args) {
        
    }
    
    public static void inputArray(int[] array1d, Scanner keyboard) {
        for (int i = 0; i < array1d.length; i++) {
            array1d[i] = keyboard.nextInt();
        }
    }
    
    public static int[] inputArray(int size, Scanner keyboard) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = keyboard.nextInt();
        }
        return array;
    }
    
    public static void printArray(int[] array1d) {
        for (int element : array1d) {
            System.out.print(element + " ");
        }
    }
    
    public static void printDescendingArray(int[] array1d) {
        int[] tempArr = new int[array1d.length];
        for (int i = 0; i < array1d.length; i++) {
            tempArr[i] = array1d[i];
        }
        Arrays.sort(tempArr);
        for (int i = tempArr.length - 1; i >= 0; i--) {
            System.out.print(tempArr[i] + " ");
        }
    } 
    
    public static void print2ndElementWithIndices(int[] array1d) {
        int maxValue = array1d[0];
        for (int element : array1d) {
            maxValue = Math.max(maxValue, element);
        }

        int secondMaxValue = -1;
        for (int element: array1d) {
            if (element < maxValue) {
                secondMaxValue = element;
                break;
            }
        }

        for (int element: array1d) {
            if (element < maxValue) {
                secondMaxValue = Math.max(secondMaxValue, element);
            }
        }

        String listIndex = "";
        System.out.print(secondMaxValue + "[");
        for (int i = 0; i < array1d.length; i++) {
            if (array1d[i] == secondMaxValue) {
               listIndex += (i+1) + " ";
            }
        }
        System.out.print(listIndex.substring(0, listIndex.length()-1));
        System.out.print("]");
    }
}