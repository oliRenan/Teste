package Exercicio1;

public class FIbonacci {
    public static boolean isFibonacci(int n) {
        if (n < 0) return false;

        int a = 0, b = 1;
        while (a < n) {
            int next = a + b;
            a = b;
            b = next;
        }
        return a == n;
    }
}
