/*
Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores
 em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.
 */
import java.util.Scanner;

public class exercicio_1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1, valor2, valor3;
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        valor3 = sc.nextInt();

        int menor, medio, maior;

        if (valor1 <= valor2 && valor1 <= valor3){
            menor = valor1;
            if (valor2 <= valor3){
                medio = valor2;
                maior = valor3;
            } else {
                medio = valor3;
                maior = valor2;
            }
        }
        else if (valor2 <= valor1 && valor2 <= valor1){
            menor = valor2;
            if (valor1 <= valor3){
                medio = valor1;
                maior = valor3;
            } else {
                medio = valor3;
                maior = valor1;
            }
        }
        else {
            menor = valor3;
            if (valor1 <= valor2){
                medio = valor1;
                maior = valor2;
            } else {
                medio = valor2;
                maior = valor1;
            }
        }

        System.out.println(menor + " " +  medio + " " + maior);

        System.out.println();

        System.out.println(valor1 + " " + valor2 + " " + valor3);

        sc.close();
    }
}
