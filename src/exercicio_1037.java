/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos
([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos,
deverá ser impressa a mensagem “Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000
 */
import java.util.Locale;
import java.util.Scanner;

public class exercicio_1037 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double intervalo = sc.nextDouble();

        if (intervalo > 0.00 && intervalo <= 25.00){
            System.out.println("Intervalo [0,25]");
        }
        else if (intervalo >= 25.00 && intervalo <= 50.00){
            System.out.println("intervalo [25,50]");
        }
        else if (intervalo >= 50.00 && intervalo <= 75.00){
            System.out.println("Intervalo [50,75]");
        }
        else if (intervalo >= 75.00 && intervalo <= 100.00){
            System.out.println("Intervalo [75,100]");
        }
        else System.out.println("Fora de intervalo");

        sc.close();
    }
}
