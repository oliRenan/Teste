package Exercicio1;
import java.util.Scanner;

import static Exercicio1.FIbonacci.isFibonacci;

public class Main {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        System.out.println("Digite o termo  e veja se ele pertence a sequecia");
        int n = scan.nextInt();


        if (isFibonacci(n)) {
            System.out.println("O número " + n+ " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + n + " não pertence à sequência de Fibonacci.");
        }
    }
}



