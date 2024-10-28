package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = scan.nextLine();

        int cont =0;

        for (int i = 0; i < palavra.length(); i++) {
            String letra = String.valueOf(palavra.charAt(i));
            if(letra.equals("a")||letra.equals("A")){
                cont++;
            }
        }

        if (cont > 0) {
            System.out.println("A letra 'a' apareceu " + cont + " vezes");
        } else {
            System.out.println("A letra 'a' nao aparece.");
        }


        /*
        *
        *  long cont = palavra.chars()
                          .filter(c -> c == 'a' || c == 'A')
                          .count();
        *
        *  tinha esse metodo com o uso de Streams e lambda function =)
        * */
    }
}
