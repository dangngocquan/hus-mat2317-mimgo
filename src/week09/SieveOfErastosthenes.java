package week09;

import java.util.Scanner;

public class SieveOfErastosthenes {
    public static void main (String[] args) {
        /* Code test */
    }
    
    public static String erastosthenes(int number) {
        String ans = "";
        boolean[] isPrime = new boolean[number+ 1];
        for (int i = 0; i < number+1; i++) {
        	isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= number; i++) {
        	if (isPrime[i]) {
        		ans += i + " ";
        		for (int j = 2*i; j <= number; j += i) {
        			isPrime[j] = false;
        		}
        	}
        }
        
        return ans.trim();
    }
}