package lastTerm.Y20212022.Code01.exercise01;

import java.util.Scanner;

public class Babylonian {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(x);
        scanner.close();
    }
    
    public static double babylonian(int x) {
        double y = 1.0;
        while (Math.abs(y - x*1.0 / y) >= 0.00000000000001) {
        	y = (y + x*1.0 / y)/2;
        }
        return y;
    }
}
