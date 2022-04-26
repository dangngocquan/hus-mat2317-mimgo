package week09;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main (String[] args) {
        /* Code test */
    }
    
    public static int[][] inputMatrix(int rows, int columns, Scanner keyboard) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
        	for (int j = 0; j < columns; j++) {
        		matrix[i][j] = keyboard.nextInt();
        	}
        }
        return matrix;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
        	String s = "";
        	for (int j = 0; j < matrix[0].length; j++) {
        		s += matrix[i][j] + " ";
        	}
        	System.out.println(s.trim());
        }
    }
    
    public static void printPronicsInUpperTriangularMatrix(int[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
        	for (int j = 0; j < matrix[0].length; j++) {
        		if (j >= i) {
        			int x = matrix[i][j];
        			int n = (int)Math.sqrt(x);
        			if (x == n*(n+1)) {
        				count++;
        			}
        		}
        	}
        }
        
        int[] arrayPronic = new int[count];
        count = 0;
        for (int i = 0; i < matrix.length; i++) {
        	for (int j = 0; j < matrix[0].length; j++) {
        		if (j >= i) {
        			int x = matrix[i][j];
        			int n = (int)Math.sqrt(x);
        			if (x == n*(n+1)) {
        				arrayPronic[count] = x;
        				count++;
        			}
        		}
        	}
        }
        
        Arrays.sort(arrayPronic);
        
        String s = "";
        for (int i = 0; i < count; i++) {
        	s += arrayPronic[i] + " ";
        }
        System.out.println(s.trim());
    }
}
