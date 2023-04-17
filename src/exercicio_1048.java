/*
https://www.beecrowd.com.br/judge/pt/problems/view/1048
exercicio contem imaggem.
 */
import java.util.Locale;
import java.util.Scanner;

public class exercicio_1048 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        if (salario >= 0.00 && salario <= 400.00){
            double percentual = 15.00;
            double reajuste = (percentual / 100.00) * salario;
            double novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: %.0f %%", percentual);
        }
        else if (salario >= 400.01 && salario <= 800.00){
            double percentual = 12.00;
            double reajuste = (percentual / 100) * salario;
            double novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: %.0f %%", percentual);
        }
        else if (salario >= 800.01 && salario <= 1200.00){
            double percentual = 10.00;
            double reajuste = (percentual / 100) * salario;
            double novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: %.0f %%", percentual);
        }
        else if (salario >= 1200.01 && salario <= 2000.00){
            double percentual = 7.00;
            double reajuste = (percentual / 100) * salario;
            double novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: %.0f %%", percentual);
        }
        else if (salario >= 2000.00){
            double percentual = 4.00;
            double reajuste = (percentual / 100) * salario;
            double novoSalario = salario + reajuste;
            System.out.printf("Novo salario: %.2f%n", novoSalario);
            System.out.printf("Reajuste ganho: %.2f%n", reajuste);
            System.out.printf("Em percentual: %.0f %%", percentual);
        }

        sc.close();
    }
}
