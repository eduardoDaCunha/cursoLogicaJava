/*
Leia 4 valores inteiros A, B, C e D. A seguir,
se B for maior do que C e se D for maior do que A,
e a soma de C com D for maior que a soma de A e B e se C e D,
ambos, forem positivos e se a variável A for par
escrever a mensagem "Valores aceitos", senão escrever
"Valores nao aceitos".
 */

import java.util.Scanner;

public class exercicio_1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int somaAb = a + b;
        int somaCb = c + d;

        if (b > c && d > a && somaCb > somaAb){
            int par = somaAb % 2;
            int par2 = somaCb % 2;
            System.out.println("Valores aceitos");
        } else System.out.println("Valores nao aceitos");

        sc.close();
    }
}
