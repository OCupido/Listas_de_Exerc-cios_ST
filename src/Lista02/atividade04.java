package Lista02;

import java.util.Random;
import java.util.Scanner;

public class atividade04 {
    public static void main(String[] args) {

        System.out.println("4. Sorteio ");
        Random random = new Random();
        int numeroInteiroAleatorio_0_a_10 = random.nextInt(11);

        System.out.println("Chute um número de 0 a 10: ");
        Scanner chute = new Scanner(System.in);
        int chuta = chute.nextInt();

        if (chuta == numeroInteiroAleatorio_0_a_10) System.out.println("Parabéns você acertou!!");
        else if (chuta != numeroInteiroAleatorio_0_a_10) {
            System.out.println("Você errou!! Tente de novo");
        }
    }
}
