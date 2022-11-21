package Lista03;

import java.util.Scanner;

public class atividade01 {
    public static void main(String[] args) {

        System.out.println("1- Números ímpares");
        System.out.println("Digite um Numero: ");
        Scanner num = new Scanner(System.in);
        int numero = num.nextInt();
        for(int f = 1; numero >= f; f = f +2) {
            System.out.println(f + "\n");
        }
    }
}
