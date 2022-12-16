package lista07.atividade01;

import java.util.Scanner;
import java.util.InputMismatchException;
public class calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuar = false;
        do {calculos mat = new calculos();

            System.out.println("Digite um numero: ");
            mat.numero = sc.nextInt();

            System.out.println("Digite a operação desejada: \n 1 para soma \n 2 para subtração \n" +
            " 3 para multiplicação \n 4 para divisão ");
            mat.resultado = sc.nextInt();

            System.out.println("Digite um Op: ");
            mat.op = sc.nextInt();

            switch (mat.resultado) {
                case 1:
                    mat.soma();
                    break;
                case 2:
                    mat.subtracao();
                    break;
                case 3:
                    mat.Multiplicar();
                    break;
                case 4:
                    mat.Divisao();
                    break;
            }
            System.out.println("repetir? S ou N");
            continuar = !sc.next().toUpperCase().equals("S");
        }
        while ( ! continuar);
    }
}