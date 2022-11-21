import java.util.Scanner;
import java.util.Random;
import javax.swing.*;

public class atividades03 {
    public static void main (String[] args) {
        int contatdor = 0;
        while (contatdor<=9){
            System.out.println(contatdor);
            contatdor++;
        }
        System.out.println(contatdor + "\n");

        //1- Números ímpares
        System.out.println("1- Números ímpares");
        System.out.println("Digite um Numero: ");
        Scanner num = new Scanner(System.in);
        int numero = num.nextInt();
        for(int f = 1; numero >= f; f = f +2) {
            System.out.println(f + "\n");
        }

        //2- Escada

        System.out.println("2- Escada");
        Scanner val = new Scanner(System.in);

        System.out.print("Digite um Número: ");
        int valor = val.nextInt();

        for (int i =1;i <= valor; i++){

            for (int ia =1;i>=ia ;ia++){
                System.out.print("#");
            }
            System.out.printf("\n");
        }

        //3- Soma de números aleatórios

        System.out.println("3- Soma de números aleatórios");

        int n = val.nextInt();
        Random r = new Random();

        for ( int i = 0; i < n; i++ ) {
            System.out.println( "Sorteou: " + (r.nextInt( 6 ) + 1));

        }

        //4- Produto mais caro
        System.out.println("4- Produto mais caro");


    }
}
