package week08;

import java.util.Scanner;

public class SimplifyFraction {
     public static void main (String[] args) {
       
    }
    
    // find greatest common divisor of num1 and num2
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
    
    public static void printSimplifiedFraction(int numerator, int denominator) {
        if (denominator == 0) {
            return;
        }
        if (numerator == 0) {
            System.out.println(0);
            return;
        }
        int gcdNum = gcd(numerator, denominator);
        numerator /= gcdNum;
        denominator /= gcdNum;
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        System.out.println((numerator % denominator == 0)? (numerator/denominator) : (numerator + "/" + denominator));
    }
}