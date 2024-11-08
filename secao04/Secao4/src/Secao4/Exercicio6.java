package Secao4;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a, b, c;

        System.out.println("Digite o valor para A, B, C: ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        double triangulo = a * c / 2;
        double circulo = c * c * 3.14159;
        double trapezio = (a + b) * c / 2;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("Triangulo: %.3f%n", triangulo);
        System.out.printf("Circulo: %.3f%n" , circulo);
        System.out.printf("Trapezio: %.3f%n" , trapezio);
        System.out.printf("Quadrado: %.3f%n" , quadrado);
        System.out.printf("Retangulo: %.3f%n" , retangulo);

        scan.close();





    }
}
