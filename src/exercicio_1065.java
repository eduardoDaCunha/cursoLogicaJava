/*
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.
 */
import java.util.Scanner;

public class exercicio_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int v1 = sc.nextInt();
        int cont = 0;
        int par = 0;

        if (v1 > 0){
            cont ++;
            par = v1 % 2;
        }
        int v2 = sc.nextInt();
        if (v2 > 0){
            cont ++;
            par = v2 % 2;
        }
        int v3 = sc.nextInt();
        if (v3 > 0){
            cont ++;
            par = v3 % 2;
        }
        int v4 = sc.nextInt();
        if (v4 > 0){
            cont ++;
            par = v4 % 2;
        }
        int v5 = sc.nextInt();
        if (v5 > 0){
            cont ++;
            par = v5 % 2;
        }

        System.out.printf("%d valores pares", cont);

        sc.close();
    }
}
