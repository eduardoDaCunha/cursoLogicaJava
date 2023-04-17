/*
Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda
para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.
Este exercicio contem imagem, segue o link: https://www.beecrowd.com.br/judge/pt/problems/view/1049
 */
import java.util.Scanner;

public class exercicio_1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String c1, c2, c3;
        c1 = sc.next();
        c2 = sc.next();
        c3 = sc.next();

        if (c1.equals("vertebrado") && c2.equals("ave") && c3.equals("carnivoro")){
            System.out.println("aguia");
        }
        else if (c1.equals("vertebrado") && c2.equals("ave") && c3.equals("onivoro")){
            System.out.println("pomba");
        }
        else if (c1.equals("vertebrado") && c2.equals("mamifero") && c3.equals("onivoro")){
            System.out.println("homem");
        }
        else if (c1.equals("vertebrado") && c2.equals("mamifero") && c3.equals("herbivoro")){
            System.out.println("vaca");
        }
        else if (c1.equals("inveterbrado") && c2.equals("inseto") && c3.equals("hematofago")){
            System.out.println("pulga");
        }
        else if (c1.equals("invertebrado") && c2.equals("inseto") && c3.equals("herbivoro")){
            System.out.println("lagarta");
        }
        else if (c1.equals("invertebrado") && c2.equals("analideo") && c3.equals("hematofago")){
            System.out.println("sanguessuga");
        }
        else if (c1.equals("invertebrado") && c2.equals("analideo") && c3.equals("onivoro")){
            System.out.println("minhoca");
        }

        sc.close();
    }
}
