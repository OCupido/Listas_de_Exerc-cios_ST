package Lista02;

import java.util.Scanner;

public class atividade03 {
    public static void main(String[] args) {

        System.out.println("3. Determinar se uma pessoa pode contratar um empréstimo");
        System.out.printf("Digite sua idade");
        Scanner idade = new Scanner(System.in);
        int idd = idade.nextInt();


        if (idd >=18){
            System.out.printf("Digite seu salario");
            Scanner salario = new Scanner(System.in);
            int sal = salario.nextInt();
            int trint = (sal * 30) /100;

            System.out.printf("Digite em quantas parcelas voce quer pagar ");
            Scanner parcela = new Scanner(System.in);
            int parc = parcela.nextInt();


            if ( parc >=3 && parc<=24 ){
                System.out.println("Digite o valor do imprestimo \n");
                Scanner imprestimo = new Scanner(System.in);
                int impr = imprestimo.nextInt();

                int nparc = impr /  parc;

                if (nparc < trint){
                    System.out.printf("Voce tera que pagar %d por mes", nparc);
                }else if (nparc > trint){
                    System.out.printf("o valor exede 30% do seu salario \n");

                }
            }
            else if (parc <3 && parc>24){
                System.out.printf("O minimo de parcelas sao 3 e max 24 \n");
            }

            else if ( idd <18){
                System.out.printf("Voce noa pode fazer o imprestimo por que vc e de menor \n");
            }
        }
    }
}
