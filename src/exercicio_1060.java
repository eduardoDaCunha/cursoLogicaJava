/*
Faça um programa que leia 6 valores. Estes valores serão somente negativos ou
positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.
 */
import java.util.Locale;
import java.util.Scanner;

public class exercicio_1060 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double cont = 0;

        double v1 = sc.nextDouble();
        if (v1 > 0){
            cont ++;
        }
        double v2 = sc.nextDouble();
        if (v2 > 0){
            cont ++;
        }
        double v3= sc.nextDouble();
        if (v3 > 0){
            cont ++;
        }
        double v4 = sc.nextDouble();
        if (v4 > 0){
            cont ++;
        }
        double v5 = sc.nextDouble();
        if (v5 > 0){
            cont ++;
        }
        double v6 = sc.nextDouble();
        if (v6 > 0){
            cont ++;
        }

        System.out.println(cont + "valores positivos");

        sc.close();
    }
}
