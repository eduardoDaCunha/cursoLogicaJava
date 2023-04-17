import java.util.Scanner;

import javax.xml.namespace.QName;

public class exercicio_1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        double pi = 3.14159;
        double formula = (4.0 / 3.0) * pi * Math.pow(R, 3.0);

        System.out.printf("VOLUME = %.3f", formula);

        sc.close();

        int interlocutor = 29;

    }
}
