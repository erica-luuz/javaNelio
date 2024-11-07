package Secao4;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("insira o código da 1º peça:");
        int codPeca1 = scan.nextInt();

        System.out.println("insira a quantidade  da 1º peça:");
        int quantPeca1 = scan.nextInt();

        System.out.println("insira  valor unitário da 1º peça:");
        double valorUnitPeca1 = scan.nextDouble();

        double resultado1 = quantPeca1 * valorUnitPeca1;

        System.out.println("insira o código da 2º peça:");
        int codPeca2 = scan.nextInt();

        System.out.println("insira a quantidade  da 2º peça:");
        int quantPeca2 = scan.nextInt();

        System.out.println("insira  valor unitário da 2º peça:");
        double valorUnitPeca2 = scan.nextDouble();

        double resultado2 = quantPeca2 * valorUnitPeca2;

        double valorTotal = resultado1 + resultado2;

        System.out.printf("Valor a Pagar: Rr$ %.2f%n", valorTotal);



    }

}

