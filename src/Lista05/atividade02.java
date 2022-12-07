package Lista05;
import java.util.Scanner;
public class atividade02 {
    public static void main(String[] args) {

        System.out.println("5. Calculo de desconto de INSS");

        Scanner ler = new Scanner(System.in);

        System.out.println("\n Seja bem vindo(a), a CREDICARD. \n");

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
            System.out.println(" O crédito solicitado reprovado. ");
        }
    }
}