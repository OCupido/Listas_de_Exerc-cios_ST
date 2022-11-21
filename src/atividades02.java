import java.util.Scanner;
import java.util.Random;
public class atividades02 {
    public static void main (String[] args) {
        //1. Determinar se um aluno passou de ano.

        System.out.println("1. Determinar se um aluno passou de ano.");
        double ps = 5;
        double ss = 8;
        double ts = 6;
        double qs = 7;
        double result = (ps + ss + ts + qs) / 4;
        if (result >= 6) System.out.println(" Sua nota foi " + result +" Parabéns você passou! " + "\n");
        else if (result < 6) {
            System.out.println("Sua nota foi " + result + " Reprovado(a), estude mais." + "\n");
        }

        //2. Conversor Celsius / Farenheit (revisitado)

        System.out.println("2. Conversor Celsius / Farenheit (revisitado)");
        double c = 0;
        double f = 32;
        double r = (c * 9/5) + f;
        System.out.println("C " + c);
        System.out.println("F " + r + "\n");

        //3. Determinar se uma pessoa pode contratar um empréstimo

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

        //4. Sorteio

        System.out.println("4. Sorteio ");
        Random random = new Random();
        int numeroInteiroAleatorio_0_a_10 = random.nextInt(10);

        System.out.println("Chute um número de 0 a 10: ");
        Scanner chute = new Scanner(System.in);
        int chuta = chute.nextInt();

        if (chuta == numeroInteiroAleatorio_0_a_10) System.out.println("Parabéns você acertou!!");
        else if (chuta != numeroInteiroAleatorio_0_a_10) {
            System.out.println("Você errou!! Tente de novo");
        }

        //5. Calculo de desconto de INSS

        System.out.println("5. Calculo de desconto de INSS");

        Scanner ler = new Scanner(System.in);

        System.out.println("\n Seja bem vindo (a), a CREDICARD. \n");

        boolean lValidaIdade = true;
        while (lValidaIdade) {

            System.out.println("Para dar andamento a sua solicitação, informe a sua idade:");
            int idad = ler.nextInt();
            if (idad >= 18 && idad <= 65) {
                lValidaIdade = false;
            } else{
                System.out.println("Você não tem idade suficiente para fazer o empréstimo");
            }
        }
        System.out.println("Insira o seu salário:");
        double salario = ler.nextDouble();

        System.out.println("Qual o valor do crédito que você deseja ? ");
        double credito = ler.nextDouble();

        System.out.println("Digite em quantas parcelas você deseja pagar ?");
        int parcelas = ler.nextInt();

        boolean lValidaParcelas = true;
        while (lValidaParcelas) {

            if (parcelas >= 3 && parcelas <= 24) {
                lValidaParcelas = false;
            } else{
                System.out.println("Você deve escolher no mínimo 3 e no máximo 24 parcelas");
            }

        }
        double nemp = salario * 0.3;
        double parc = credito / parcelas;
        if(nemp > parc){
            System.out.println(" O crédito solicitado foi aprovado. ");
        } else{
            System.out.println(" O crédito solicitado não foi aprovado. ");
        }
    }
}
