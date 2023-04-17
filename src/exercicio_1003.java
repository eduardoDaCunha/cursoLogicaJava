import java.util.Scanner;

public class exercicio_1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        int soma = A + B;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
