import java.util.Locale;
import java.util.Scanner;

public class exercicio_1012 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        double pi = 3.14159;

        double triangulo = A * C / 2;
        double circulo = pi * Math.pow(C, 2);
        double trapezio = (A + B) / 2 * C;
        double quadrado = (B + B) * 2;
        double retangulo = A * B;

        System.out.printf("%.3f%n", triangulo);
        System.out.printf("%.3f%n", circulo);
        System.out.printf("%.3f%n", trapezio);
        System.out.printf("%.3f%n", quadrado);
        System.out.printf("%.3f%n", retangulo);

        sc.close();
    }
}
