package week09;

public class TrigonometryCalculator {
    public static void main (String[] args) {
        /* Code Test */
    }
    
    public static double calculateSin(double x) {
        while (x >= 2*Math.PI || x <= -2*Math.PI) {
        	if (x >= 2*Math.PI) {
        		x -= 2*Math.PI;
        	}else if (x <= -2*Math.PI) {
        		x += 2*Math.PI;
        	}
        }
        
        double ans = x;
        double temp = x;
        for (int i = 1; i <= 69; i += 2) {
        	temp = (-1)*temp*x*x/((i+1)*(i+2));
        	ans += temp;
        }
        
        return ans;
    }
}