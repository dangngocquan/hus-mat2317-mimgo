package week08;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double xC = scanner.nextDouble();
        double yC = scanner.nextDouble();
        double radius = scanner.nextDouble();
        double xM = scanner.nextDouble();
        double yM = scanner.nextDouble();
        scanner.close();
        
        double d = Math.sqrt((xM - xC)*(xM-xC) + (yM - yC)*(yM-yC));
        System.out.println((d > radius)? "NO" : "YES");
    }
}