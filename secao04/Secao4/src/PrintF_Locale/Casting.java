package PrintF_Locale;

public class Casting {
    public static void main(String[] args) {

        int x;
        double y;

        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);
//***************************************************
        double b ,B,h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + 8) / 2.0 * h;

        System.out.println(area);
//***************************************************
        int a, c;
        double resultado;

        a = 5;
        c = 2;

        resultado = a / c;

        System.out.println(resultado);

        resultado = (double) a / c;    // Casting e a conversao explicita dos valores
        System.out.println(resultado);

        // Outro exemplo de casting
        double d;
        int e;

        d = 5.0;
        e = (int) d;

        System.out.println(e);

    }
}
