package Lista03;

import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {

        System.out.println("2- Escada");
        Scanner val = new Scanner(System.in);

        System.out.print("Digite um Número: ");
        int valor = val.nextInt();

        for (int i =1;i <= valor; i++){
            for (int ia =1;i>=ia ;ia++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
