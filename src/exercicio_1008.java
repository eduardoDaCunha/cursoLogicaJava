import java.util.Locale;
import java.util.Scanner;

public class exercicio_1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, horasTrabalhadas;
        numero = sc.nextInt();
        horasTrabalhadas = sc.nextInt();

        double valorPhora = sc.nextDouble();

        double salario = horasTrabalhadas * valorPhora;

        System.out.println("NUMBER = " + numero);

        System.out.printf("SALARY = U$ %.2f", salario);
        sc.close();
    }
}
