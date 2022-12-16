package lista07.atividade03;
import java.util.Scanner;
public class idade {

    public void comparacao() {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];
        int[] idades = new int[3];
        int idadeNova = 0;
        String nomePessoaNova = "";
        int idadeVelha = 0;
        String nomePessoaVelha = "";

        for (int i = 0; i < 3; i++) {
            System.out.println("digite o nome: ");
            nomes[i] = sc.next();
            System.out.println("digite a idade: ");
            idades[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            if (idades[i] < idadeVelha) {
                idadeNova = idades[i];
                nomePessoaNova = nomes[i];
            }
            if (idades[i] > idadeNova) {
                idadeVelha = idades[i];
                nomePessoaVelha = nomes[i];
            }
        }
            System.out.println("Nome da pessoa Mais Nova é: " + nomePessoaNova);
            System.out.println("Sua idade é: " + idadeNova);
            System.out.println("Nome da passoa Mais Velha é: " + nomePessoaVelha);
            System.out.println("Sua idade é: " + idadeVelha);

    }
}
