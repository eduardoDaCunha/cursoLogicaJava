/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
Obs.: apenas para facilitar o cálculo, considere o mês com 30 dias.
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
 Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
*/
import java.util.Scanner;

public class exercicio_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idadeDias = sc.nextInt();
        double ano = idadeDias / 365;
        double sobraAno = idadeDias - 365;
        double mes = (double) sobraAno / 30;

        double multipDias = mes * 30;

        double dias = multipDias % 30;

        System.out.printf("%.0f ano (s)%n%.0f mes (es)%n%.0f dia (s)", ano, mes, dias);

        sc.close();
    }
}
