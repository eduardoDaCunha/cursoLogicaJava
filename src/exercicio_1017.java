import java.util.Scanner;

public class exercicio_1017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempoGasto = sc.nextInt();
        int veloMedia = sc.nextInt();

        int km_h = 12;

        double consumo = (double) (tempoGasto * veloMedia) / km_h;

        System.out.printf("%.3f", consumo);

        sc.close();
    }
}
