package PrintF_Locale;

import java.util.Locale;

public class ParaConcatenar {

    public static void main(String[] args) {
        double x = 10.35784;
        // O pintf serve para eu imprimir alguma coisa formatada.
        System.out.println(x);
        System.out.printf("%.2f%n", x);  // aqui que mostre apenas 2 casas decimais.
        System.out.printf("%.4f%n", x);  // aqui que mostre apenas 4 casas decimais.

        Locale.setDefault(Locale.US);

        System.out.printf("%.4f%n", x);
        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("Resultado = %.2f metros%n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome,idade,renda);
    }
}
