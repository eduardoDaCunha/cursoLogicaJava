import java.util.Locale;
import java.util.Scanner;

public class exercicio_1010 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1, codigo2, numeroPeca1, numeroPeca2;
        double valor1, valor2;

        codigo1 = sc.nextInt();
        numeroPeca1 = sc.nextInt();
        valor1 = sc.nextDouble();
        double total1 = numeroPeca1 * valor1;

        codigo2 = sc.nextInt();
        numeroPeca2 = sc.nextInt();
        valor2 = sc.nextDouble();
        double total2 = numeroPeca2 * valor2;

        double somaValores = total1 + total2;

        System.out.printf("VALOR A PAGAR = R$ %.2f", somaValores);

        sc.close();
    }
}
