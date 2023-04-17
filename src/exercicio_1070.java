/*
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.
 */
import java.util.Scanner;

public class exercicio_1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x % 2 != 0) {
            System.out.println(x);
            System.out.println(x + 2);
            System.out.println(x + 4);
            System.out.println(x + 6);
            System.out.println(x + 8);
            System.out.println(x + 10);
        } else {
            System.out.println(x + 1);
            System.out.println(x + 3);
            System.out.println(x + 5);
            System.out.println(x + 7);
            System.out.println(x + 9);
            System.out.println(x + 11);
        }

        sc.close();
    }
}
