package appBanco;
import java.util.Scanner;
public class Conta {
    private String nome;
    private int numero, saques;
    private double saldo, investido;
    Scanner sc = new Scanner(System.in);
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getNumero() { return numero; }
    public void setNumero(int saldo) { this.numero = numero; }
    public int getSaques() { return saques; }
    public void setSaques(int saques) { this.saques = saques; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public double getInvestido() { return investido; }
    public void setInvestido(double investido) { this.investido = investido; }

    public Conta(String nome, int numero, double saldo){
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void exibePessoas(){
        System.out.println("\t Escolha o tipo de pessoa que você deseja entrar como: ");
        System.out.println("1 - Pessoa Física");
        System.out.println("2 - Pessoa Jurídica");
    }
    public void escolhePessoa(String pessoa){
        switch(pessoa){
            case "1":
                System.out.print("Você escolheu pessoa física.\n");
                System.out.println("");
                break;
            case "2":
                System.out.print("Você escolheu pessoa jurídica.\n");
                System.out.println("");
                break;
            default:
                System.out.println("Opção inválida");
                System.out.println("");
        }
    }

    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            System.out.println("Sacado: " + valor);
            System.out.println("Saldo atual: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }

    public void sacarTaxa(double valor){
        if(saldo >= valor){
            double valor_c_taxa = valor - (valor * 0.005);
            saldo -= valor_c_taxa;
            System.out.println("Sacado: " + valor_c_taxa + " (Houve 0,5% de taxa)");
            System.out.println("Saldo atual: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositado: " + valor);
        System.out.println("Saldo atual: " + saldo + "\n");
    }

    public void transferir(double valor){
        int trans_conta;
        if(saldo >= valor){
            System.out.println("Digite o número da conta na qual você deseja transferir: ");
            trans_conta = sc.nextInt();
            saldo -= valor;
            System.out.println("Foram transferidos " + valor + " para a conta " + trans_conta);
            System.out.println("Saldo atual: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }

    public void transferirTaxa(double valor){
        int trans_conta;
        if(saldo >= valor){
            System.out.println("Digite o número da conta na qual você deseja transferir: ");
            trans_conta = sc.nextInt();
            double valor_c_taxa = valor - (valor * 0.005);
            saldo -= valor_c_taxa;
            System.out.println("Foram transferidos " + valor_c_taxa + " para a conta " + trans_conta + " (Houve 0,5% de taxa)");
            System.out.println("Saldo atual: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }

    public void extrato(){
        System.out.println("\tExtrato");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número da conta: " + this.numero);
        System.out.printf("Saldo atual: %.2f\n",this.saldo);
        System.out.println(" ");
    }

    public void extratoInvestimento(){
        System.out.println("\tExtrato");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número da conta: " + this.numero);
        System.out.printf("Saldo atual: %.2f\n",this.saldo);
        System.out.printf("Reais investido: %.2f\n",this.investido);
        System.out.println(" ");
    }

    public void investir(double valor) {
        investido += valor;
        System.out.println("Investido: " + valor);
    }

    public void investirBonus(double valor) {
        double valor_bonus = valor + (valor * 0.02);
        investido += valor_bonus;
        System.out.println("Investido: " + valor_bonus + " (Há +2% de rendimento extra)");
    }

}
