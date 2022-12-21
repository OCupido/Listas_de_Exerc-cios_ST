/* construir uma aplicação de cálculo de notas de um aluno
sabendo que ele pode ser aluno da Univille ou aluno da UFSC
que possuem formas de avaliação diferente. mostrar os dados
e a média do aluno
HERANÇA: possibilidade de se reutilizar os atributos e os metodos em outra classe.
é possével fazer herança unica, não existe  herança multipla no java, mas uma classe
pode gerar várias outras classes-filhas.*/
package lista09.exemplo_herança;

public class aluno_main {
    public static void main(String[] args) {

        alunoUFSC aluno1 = new alunoUFSC();
        alunoUFSC alunoUFSC2 = new alunoUFSC(9.5, 1.5, 6.4);

        aluno1.setNomeAluno("Anderson Vieira");
        aluno1.setMatricula("2022-245345");
        aluno1.setProva1(7.5);
        aluno1.setProva2(8.5);

        System.out.println(aluno1.getNomeAluno());
        System.out.println(aluno1.getMatricula());
        System.out.println(aluno1.toString());
        aluno1.calcMedia();

        System.out.println("\n");

        alunoUniville aluno2 = new alunoUniville();
        aluno2.setNomeAluno("Fulano de Tal");
        aluno2.setMatricula("2023-988997");
        aluno2.setProva1(10.0);
        aluno2.setProva2(6.0);
        aluno2.setProva3(8.5);

        System.out.println(aluno2.getNomeAluno());
        System.out.println(aluno2.getMatricula());
        System.out.println(aluno2.toString());
        aluno2.calcMedia();
    }
}
