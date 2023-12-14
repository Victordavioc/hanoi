package src.main.java;//package src.main.java.org.example;

public class Hanoi {
    public static int hanoi(int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }
        return hanoi(n * n - 1);
    }
}
