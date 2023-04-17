import java.util.Locale;
import java.util.Scanner;

public class exercicio_1009 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeF = sc.next();

        double salarioF = sc.nextDouble();
        double totVendas = sc.nextDouble();
        double porcentagemVenda = 0.15;
        double comissao = totVendas * porcentagemVenda;
        double totalReceber = comissao + salarioF;

        System.out.printf("TOTAL = R$ %.2f", totalReceber);

        sc.close();
    }
}
