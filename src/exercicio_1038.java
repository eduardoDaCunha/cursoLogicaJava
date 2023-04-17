/*
https://www.beecrowd.com.br/judge/pt/problems/view/1038
link para o exercicio, pois contem imgagem.
 */

import java.util.Scanner;

public class exercicio_1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double valor = 0;
        String item;

        if (codigo == 1){
            item = "cachorroQuente";
            valor = 4.00;
        } else if ( codigo == 2){
            item = "x_salada";
            valor = 4.50;
        } else if ( codigo == 3){
            item = "x_bacon";
            valor = 5.00;
        } else if (codigo == 4){
            item = "torrada_simples";
            valor = 2.00;
            } else if (codigo == 5){
                item = "refrigerante";
                valor = 1.50;
        }

        double total = quantidade * valor;

        System.out.printf("Total: R$ %.2f", total);

        sc.close();
    }
}
