/*
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
 */
import java.util.Scanner;

public class exercicio_1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaInicial, minutoInicial, horaFinal, minutoFinal, duracaoHora, duracaoMinuto;

        horaInicial = sc.nextInt();
        minutoInicial = sc.nextInt();
        horaFinal = sc.nextInt();
        minutoFinal = sc.nextInt();

        int tempoInicial = horaInicial * 60 + minutoInicial;
        int tempoFinal = horaFinal * 60 + minutoFinal;

        int duracao = 0;

        if (tempoInicial < tempoFinal) {
            duracao = tempoFinal - tempoInicial;
        } else {
            duracao = 1440 - tempoInicial + tempoFinal;
        }

        duracaoHora = duracao / 60;
        duracaoMinuto = duracao % 60;

        System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMinuto + " MINUTO(S)");

        sc.close();
    }
}

