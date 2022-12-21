package lista08.atividade01;

import java.util.Scanner;

public class banco_main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        banco bank = new banco();

        System.out.println("Digite o numero da sua conta: ");
        bank.setNumeroDaConta(sc.nextDouble());

        System.out.println("Digite seu Saldo: ");
        bank.setSaldo(sc.nextDouble());

        System.out.println("Digite seu debito: ");
        bank.setDebito(sc.nextDouble());

        System.out.println("Digite seu crédito: ");
        bank.setCredito(sc.nextDouble());

        bank.calcularSaldo();
        System.out.println("O saldo da conta " + bank.getNumeroDaConta() + " é " + bank.getCalculo());
    }
}