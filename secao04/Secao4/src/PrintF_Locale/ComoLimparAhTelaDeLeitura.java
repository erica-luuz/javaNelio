package PrintF_Locale;

import java.util.Scanner;

public class ComoLimparAhTelaDeLeitura {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = scan.nextInt();
        scan.nextLine();
        s1 = scan.nextLine();
        s2 = scan.nextLine();
        s3 = scan.nextLine();


        System.out.println("Dados Digitados:");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        scan.close();
    }
}
