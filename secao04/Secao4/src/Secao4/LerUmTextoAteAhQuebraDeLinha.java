package Secao4;

import java.util.Scanner;

public class LerUmTextoAteAhQuebraDeLinha {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s1, s2, s3;

        scan.nextLine();
        s1 = scan.nextLine();
        s2 = scan.nextLine();
        s3 = scan.nextLine();


        System.out.println("Dados Digitados:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        scan.close();
    }
}
