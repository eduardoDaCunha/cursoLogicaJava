/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
*/

import java.util.Locale;
import java.util.Scanner;
public class exercicio_1018 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int valor = sc.nextInt();

        System.out.println(valor);
        int nota100 = valor / 100;
        valor = valor % 100;

        int nota50 = valor / 50;
        valor = valor % 50;

        int nota20 = valor / 20;
        valor = valor % 20;

        int nota10 = valor / 10;
        valor = valor % 10;

        int nota5 = valor / 5;
        valor = valor % 5;

        int nota2 = valor / 2;
        valor = valor % 2;

        int nota1 = valor;
        valor = valor % 1;

        System.out.printf("%d nota (s) de 100%n", nota100);
        System.out.printf("%d nota (s) de 50%n", nota50 );
        System.out.printf("%d nota (s) de 20%n", nota20 );
        System.out.printf("%d nota (s) de 10%n", nota10 );
        System.out.printf("%d nota (s) de 5%n", nota5 );
        System.out.printf("%d nota (s) de 2%n", nota2 );
        System.out.printf("%d nota (s) de 1%n", nota1 );

        sc.close();
    }
}
