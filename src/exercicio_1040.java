/*
No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. Imprima então a mensagem "Nota do exame:
" acompanhada pela nota digitada. Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2).
e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a média tenha ficado 4.9 ou menos).
Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final
para esse aluno.
 */
import java.util.Locale;
import java.util.Scanner;

public class exercicio_1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        float n1, n2, n3, n4;
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        float peso1 = n1 * 2;
        float peso2 = n2 * 3;
        float peso3 = n3 * 4;
        float peso4 = n4 * 1;

        float media = (peso1 + peso2 + peso3 + peso4) / (2+3+4+1);

        if (media >= 7.0 ){
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5.0){
            System.out.printf("Media = %.1f%n", media);
            System.out.println("Aluno reprovado.");
        }
        else if (media >= 5.0 || media <= 6.9){
            System.out.printf("Media = %.1f", media);
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: ");
            float notaExame = sc.nextFloat();
            float novaMedia = (notaExame + media) / 2;

            if (novaMedia >= 5.0){
                System.out.println("Aluno aprovado");
                System.out.println(novaMedia);

            }
        }


        sc.close();
    }
}
