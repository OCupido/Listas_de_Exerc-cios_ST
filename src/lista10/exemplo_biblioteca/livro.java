//classe abstrata uma classe que n pode ser instanciada
//ou seja não pode gerar objetos dela. a ideia é que sejam
//gerados apenas objetos das classes filhas.
package lista10.exemplo_biblioteca;

import java.util.Scanner;

public abstract class livro {
    Scanner sc = new Scanner(System.in);
    public String nome;
    public String autor;

    public void entradaDados(){
        System.out.println("Informe o nome do livro: ");
        nome = sc.nextLine();
        System.out.println("Informe o autor do lirvro: ");
        autor = sc.nextLine();
    }
    public void imprimeDados(){
        System.out.println("livro: " + nome);
        System.out.println("autor: " + autor);
    }
}
