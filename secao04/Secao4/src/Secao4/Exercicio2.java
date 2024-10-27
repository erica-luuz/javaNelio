package Secao4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);


        double raio = scan.nextDouble();
        double areaDoCirculo = Math.PI * Math.pow(raio, 2);
        //double areaDoCirculo = Math.PI * (raio * raio); // ou usar assim, tambem esta correto!

        System.out.printf("A = %.4f%n", areaDoCirculo);
    }
}
