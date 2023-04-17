/*
Leia um número inteiro que representa um código de DDD para discagem interurbana.
Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
o exercicio contem imagem, segue o link: https://www.beecrowd.com.br/judge/pt/problems/view/1050
 */
import java.util.Scanner;

public class exercicios_1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int DDD = sc.nextInt();

        if (DDD == 61){
            System.out.println("Brasilia");
        }
        else if (DDD == 71){
            System.out.println("Salvador");
        }
        else if (DDD == 11){
            System.out.println("Sao Paulo");
        }
        else if (DDD == 21) {
            System.out.println("Rio de Janeiro");
        }
        else if (DDD == 32){
            System.out.println("Juiz de Fora");
        }
        else if (DDD == 19){
            System.out.println("Campinas");
        }
        else if (DDD == 27){
            System.out.println("Vitoria");
        }
        else if (DDD == 31){
            System.out.println("Belo Horizonte");
        }

        sc.close();
    }
}
