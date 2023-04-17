/*
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
 */
import java.util.Locale;
import java.util.Scanner;

public class exercicio_1064 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double cont = 0;
        double somaPositivo = 0;

        double v1 = sc.nextDouble();
        if (v1 > 0){
            cont ++;
            somaPositivo += v1;
        }
        double v2 = sc.nextDouble();
        if (v2 > 0){
            cont ++;
            somaPositivo += v2;
        }
        double v3= sc.nextDouble();
        if (v3 > 0){
            cont ++;
            somaPositivo += v3;

        }
        double v4 = sc.nextDouble();
        if (v4 > 0){
            cont ++;
            somaPositivo += v4;
        }
        double v5 = sc.nextDouble();
        if (v5 > 0){
            cont ++;
            somaPositivo += v5;
        }
        double v6 = sc.nextDouble();
        if (v6 > 0){
            cont ++;
            somaPositivo += v6;
        }
        if (cont > 0) {
            double mediaPositivos = somaPositivo / cont;
            System.out.println("Valores positivos: " + cont);
            System.out.printf("%.1f", mediaPositivos);
        }

        sc.close();
    }
}
