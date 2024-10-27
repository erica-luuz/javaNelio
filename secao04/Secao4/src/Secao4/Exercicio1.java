package Secao4;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();

        int soma = valor1 + valor2;

        System.out.println("Soma = " + soma);


        scan.close();
    }
}
