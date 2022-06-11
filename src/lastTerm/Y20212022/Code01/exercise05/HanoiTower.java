package lastTerm.Y20212022.Code01.exercise05;

public class HanoiTower {

    public static void main(String[] args) {
        int n = 3;
        recursiveHanoi(n, 'A', 'B', 'C');
    }

    public static void recursiveHanoi(int n, char s, char a, char d) {
        if (n == 1) {
        	System.out.println("D" + n + " " + s + " to " + d);
        	return;
        }
        recursiveHanoi(n-1, s, d, a);
        System.out.println("D" + n + " " + s + " to " + d);
        recursiveHanoi(n-1, a, s, d);
    }
}
