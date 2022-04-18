package week07;

import java.util.Random;
import java.util.Scanner;

/**
 * ...
 * @author Bris
 * @version 1.0
 * @since 9:24:33 PM -  Apr 18, 2022
 */
public class Matrix {

  public static void main(String[] args) {
      
  }
  
  /* Method to generate random matrix, used to test program */
  public static int[][] generateMatrix(int rows, int columns) {
    if ((rows <= 0) || (columns <= 0)) {
      return null;
    }
    
    Random randomGenerator = new Random();
    int[][] newMatrix = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        newMatrix[i][j] = Math.abs(randomGenerator.nextInt()) % 100;
      }
    }
    
    return newMatrix;
  }
  
  /* Method to check valid matrix */ 
  public static boolean isValid(int[][] matrix) {
    if ((matrix == null) || (matrix.length == 0) || (matrix[0].length ==0)) {
      return false;
    }
    return true;
  }
  
  /* Method to check valid array */
  public static boolean isValid(int[] array) {
    if ((array == null) || (array.length == 0)) {
      return false;
    }
    
    return true;
  }

  public static void inputMatrix(int[][] matrix, Scanner keyboard) {
    if (!isValid(matrix)) {
      return;
    }
    
    for (int row = 0; row < matrix.length; row++) {
    	for (int column = 0; column < matrix[0].length; column++) {
    		matrix[row][column] = keyboard.nextInt();
    	}
    }
  }

  public static int[][] inputMatrix(int rows, int columns, Scanner keyboard) {
    if ((rows <= 0) || (columns <= 0)) {
      return null;
    }
    
    int[][] matrix = new int[rows][columns];
    for (int row = 0; row < rows; row++) {
    	for (int column = 0; column < columns; column++) {
    		matrix[row][column] = keyboard.nextInt();
    	}
    }
    
    return matrix;
  }
  
  /* Method to print a array */
  public static void printArray(int[] array) {
    if (!isValid(array)) {
      return;
    }
    
    StringBuilder arrayString = new StringBuilder();
    for (int elem : array) {
      arrayString.append(elem).append(" ");
    }
    System.out.print(arrayString.toString().trim());
  }

  /* Method to print a matrix (2d array) */
  public static void printMatrix(int[][] matrix) {
    if (!isValid(matrix)) {
      return;
    }

    StringBuilder stringRow = new StringBuilder();
    for (int[] row : matrix) {
      stringRow.setLength(0);
      for (int elem : row) {
        stringRow.append(elem).append(" ");
      }
      System.out.println(stringRow.toString().trim());
    }
  }
  
  /* Method to add 2 matrices */
  public static int[][] addMatrices(int[][] leftMatrix, int[][] rightMatrix) {
    if ((!isValid(leftMatrix)) || (!isValid(rightMatrix))) {
      return null;
    }
    
    if ((leftMatrix.length != rightMatrix.length) 
         || (leftMatrix[0].length != rightMatrix[0].length)) {
      return null; 
    }
    
    int[][] sumMatrix = new int[leftMatrix.length][leftMatrix[0].length];
    for (int row = 0; row < sumMatrix.length; row++) {
    	for (int column = 0; column < sumMatrix[0].length; column++) {
    		sumMatrix[row][column] = leftMatrix[row][column] + rightMatrix[row][column];
    	}
    }
    return sumMatrix;
  }
  
  /* Method to sum columns of matrix */
  public static int[] sumColumns(int[][] matrix) {
    if (!isValid(matrix)) {
      return null;
    }
    
    int[] sumColumnsArray = new int[matrix[0].length];
    for (int column = 0; column < sumColumnsArray.length; column++) {
    	for (int row = 0; row < matrix.length; row++) {
    		sumColumnsArray[column] += matrix[row][column];
    	}
    }
    return sumColumnsArray;
  }
  
  /* Method to print sum of columns of matrix */
  public static void printSumColumns(int[][] matrix) {
    int[] sumArray = sumColumns(matrix);
    printArray(sumArray);
  }
  
  /* Method to delete a column of matrix */
  public static int[][] deleteColumn(int[][] matrix, int index) {
    if (!isValid(matrix)) {
      return null;
    }
    
    if ((index < 0) || (index >= matrix[0].length)) {
      return matrix;
    }
    
    if (matrix[0].length == 1) {
      return null;
    }
    
    int[][] newMatrix = new int[matrix.length][matrix[0].length - 1];
    for (int row = 0; row < matrix.length; row++) {
    	for (int column = 0; column < matrix[0].length; column++) {
    		if (column == index) {
    			continue;
    		}
    		if (column < index) {
    			newMatrix[row][column] = matrix[row][column];
    		}else {
    			newMatrix[row][column-1] = matrix[row][column];
    		}
    	}
    }
    return newMatrix;
  }
  
  /* Method to print the matrix having a column deleted */
  public static void printDeleteCulumnMatrix(int[][] matrix, int index) {
    int[][] deleteMatrix = deleteColumn(matrix, index);
    printMatrix(deleteMatrix);
  }
  
  /* Method to get upper triangular matrix of a matrix */
  public static int[][] getUpperTriangularMatrix(int[][] matrix) {
    if (!isValid(matrix)) {
      return null;
    }
    
    if (matrix.length != matrix[0].length) {
      return null;
    }
    
    int[][] upperTriangularMatrix = new int[matrix.length][matrix[0].length];
    for (int row = 0; row < upperTriangularMatrix.length; row++) {
    	for (int column = 0; column < upperTriangularMatrix[0].length; column++) {
    		if (column >= row) {
    			upperTriangularMatrix[row][column] = matrix[row][column];
    		}
    	}
    }
    return upperTriangularMatrix;
  }
  
  /* Method to print upper triangular matrix of a matrix */
  public static void printUpperTriangularMatrix(int[][] matrix) {
    int[][] upperTriangularMatrix = getUpperTriangularMatrix(matrix);
    printMatrix(upperTriangularMatrix);
  }
  
  /* Method to check if a number is a prime */
  public static boolean isPrime(int number) {
    if (number <= 1) {
    	return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
    	if (number % i == 0) {
    		return false;
    	}
    }
    return true;
  }
  
  /* Method to get all primes in upper triangular matrix of a matrix */
  public static int[] getPrimesInUpperTriangularMatrix(int[][] matrix) {
	  int countPrimeNum = 0;
	  for (int row = 0; row < matrix.length; row++) {
    	for (int column = 0; column < matrix[0].length; column++) {
    		if (column >= row) {
    			if (isPrime(matrix[row][column])) {
    				countPrimeNum++;
    			}
    		}
    	}
	  }
	  int[] primeNumArray = new int[countPrimeNum];
	  countPrimeNum = 0;
	  for (int row = 0; row < matrix.length; row++) {
	    for (int column = 0; column < matrix[0].length; column++) {
	    	if (column >= row) {
	    		if (isPrime(matrix[row][column])) {
	    			primeNumArray[countPrimeNum] = matrix[row][column];
	    			countPrimeNum++;
	    		}
	    	}
	    }
	  }
	  return primeNumArray;
  }
  
  /* Method to sort an array */
  public static void sortArrayInAscendingOrderUsingSelectionSort(int[] array) {
    if (!isValid(array)) {
      return;
    }

    int temp;
    int minIndex;
    for (int i = 0; i < array.length - 1; i++) {
      minIndex = i;
      // find index of the smallest element
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }

      // swap the smallest element and ith element
      if (minIndex != i) {
        temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
      }
    }
  }
}
