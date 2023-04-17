/*Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
 As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
A seguir mostre a relação de notas necessárias.
 */

import java.util.Locale;
import java.util.Scanner;

public class exercicio_1021 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();
        int notas100 = (int) (valor / 100);
        valor %= 100.0;

        int notas50 = (int) (valor / 50.0);
        valor %= 50.0;

        int notas20 = (int) (valor / 20.0);
        valor %= 20.0;

        int notas10 = (int) (valor / 10.0);
        valor %= 10.0;

        int notas5 = (int) (valor / 5.0);
        valor %= 5.0;

        int notas2 = (int) (valor / 2.0);
        valor %= 2.0;

        int moedas1 = (int) (valor / 1.0);
        valor %= 1.0;

        int moedas50 = (int) (valor / 0.5);
        valor %= 0.5;

        int moedas25 = (int) (valor / 0.25);
        valor %= 0.25;

        int moedas10 = (int) (valor / 0.10);
        valor %= 0.10;

        int moedas5 = (int) (valor / 0.05);
        valor %= 0.05;

        int moedas1cent = (int) (valor / 0.01);

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas5 + " moeda(s) de R$ 0.05");
        System.out.println(moedas1cent + " moeda(s) de R$ 0.01");

        sc.close();
    }
}
