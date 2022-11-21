package Lista03;

import java.util.Random;
import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {

        Scanner val = new Scanner(System.in);
        System.out.println("3- Soma de números aleatórios");

        int n = val.nextInt();
        Random r = new Random();
        int soma = 0;
        for ( int i = 0; i < n; i++ ) {
            int rand = r.nextInt(6) +1;
            System.out.println( "Sorteou: " + rand);
            soma += rand;

        }
        System.out.println("A soma é: " + soma);

    }
}
