import java.util.Scanner;

public class exercicio_1016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int minutos = 2;

        int distanciaMinutos = Y * minutos;

        System.out.println(distanciaMinutos + " Minutos");

        sc.close();
    }
}
