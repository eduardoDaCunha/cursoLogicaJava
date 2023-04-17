import java.util.Locale;
import java.util.Scanner;

public class exercicio_1005 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B;
        A = sc.nextDouble();
        B = sc.nextDouble();

        double peso1, peso2;
        peso1 = 3.5;
        peso2 = 7.5;

        double somaNotas = A * peso1 + B * peso2;
        double somaPesos = peso1 + peso2;

        double media = somaNotas / somaPesos;

        System.out.printf("MEDIA = %.5f", media);

        sc.close();
    }
}
