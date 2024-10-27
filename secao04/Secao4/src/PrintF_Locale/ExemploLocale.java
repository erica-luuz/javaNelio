package PrintF_Locale;

import java.util.Locale;

public class ExemploLocale {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;
        // O pintf serve para eu imprimir alguma coisa formatada.
        System.out.println(x);
        System.out.printf("%.2f%n", x);  // aqui que mostre apenas 2 casas decimais.
        System.out.printf("%.4f%n", x);  // aqui que mostre apenas 4 casas decimais.

        Locale.setDefault(Locale.US);

        System.out.printf("%.4f%n", x);

        /* o Locale serve para colocar meu codigo em padrao americano, onde na saidas nao sairao
        "," e sim ".".
         */

    }
}
