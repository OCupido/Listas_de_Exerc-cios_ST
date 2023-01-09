package lista10.exemplo_biblioteca;

import java.util.Scanner;

public class acervo extends livro{
    Scanner sc = new Scanner(System.in);
    public int quantidade;
    public String editora;

    public void entradaDados(){
        System.out.println("Digite ");
        quantidade = sc.nextInt();
        System.out.println("Informe a editora: ");
        editora = sc.nextLine();
    }
    //sobrescrita (override) é a sobreposição de métodos com assinaturas e nomes iguais, mas em classes diferentes,
    //sendo herdados pela mãe.
    public void imprimirDados(){
        super.imprimeDados();
        System.out.println("quantidade: " + quantidade);
        System.out.println("editora: " + editora);
    }
}
