package week08;

import java.util.Scanner;


public class Matrix {
   public static void main(String[] args) {
      
        /* TODO */
    
    }
    
    public static void inputMatrix(int[][] matrix, Scanner keyboard) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = keyboard.nextInt();
            }
        }
        
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
            for (int j = 0; j < matrix[i].length; j++) {
                s += (matrix[i][j] + " ");
            }
            System.out.println(s.trim());
        }
    }
    
    public static void printLowerTriangularMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String s = "";
            for (int j = 0; j < matrix[i].length; j++) {
                if (j <= i) {
                    s += matrix[i][j] + " ";
                }else {
                    s += "0 ";
                }
            }
            System.out.println(s.trim());
        }
    }
    
    public static void findInLowerTriangularMatrix(int[][] matrix, int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j <= i) {
                    if (matrix[i][j] == value) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
        }
        System.out.println("NO");
    }
}