package Secao4;

import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String x;
        x = scan.next();

        System.out.println("Voce digitou: " + x);
        //**************************************************
        int a;
        a = scan.nextInt();

        System.out.println("Voce digitou: " + a);
        //*******************************************************
        double b;
        b = scan.nextDouble();

        System.out.println("Voce Digitou: " + b);
        System.out.printf( "Você Digitou: %.2f%n", b);
        //**********************************************************
        char c;
        c = scan.next().charAt(0);

        System.out.println("Voce Digitou: " + c);
        //*********************************************************
        // Lendo vários dados na mesma linha ex:
        String d;
        int e;
        double f;

        d = scan.next();
        e = scan.nextInt();
        f = scan.nextDouble();

        System.out.println("Dados Digitados:");
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);


        scan.close();
    }
}
