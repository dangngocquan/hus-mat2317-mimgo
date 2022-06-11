package lastTerm.Y20212022.Code01.exercise02;

import java.util.Scanner;

public class TrapezoidalRule {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        scanner.close();
        System.out.println(integrate(a, b));
    }
    
    static double f(double x) {
    	return Math.sqrt(x*x+1);
    }
    
    static double integrate(double a, double b, int n) {
        double h = (b-a)/n;
        double ans =0.0;
        for (int i = 0; i < n; i++) {
        	ans += (f(a + i * h) + f(a + (i+1) * h)) / 2;
        }
        ans *= h;
        return ans;
    }
    
    static double integrate(double a, double b) {
        int n = 2;
        while (Math.abs(integrate(a, b, 2*n) - integrate(a, b, n)) >= 0.0000000000001) {
        	n *= 2;
        }
        return integrate(a, b, n);
    }
}
