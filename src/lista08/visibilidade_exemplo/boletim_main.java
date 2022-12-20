package lista08.visibilidade_exemplo;

import java.util.Scanner;

public class boletim_main {
    public static void main(String[] args) {
        boletim Edu = new boletim();
        Scanner sc = new Scanner(System.in);

        /*Edu.nome = "Eduardo Alencar";
        Edu.disciplina = "Matemática";
        Edu.nota1 = 9.5;
        Edu.nota2 = 5.5;
        Edu.nota3 = 1.5;
        Edu.nota4 = 6.0;*/

        //entrada via SET
        //saida via GET

        Edu.setNome("Anderson Vieira");
        Edu.setDisciplina("Matemática");
        Edu.setNota1(9.5);
        Edu.setNota2(5.5);
        Edu.setNota3(1.5);
        Edu.setNota4(6.0);

        //entrada de dados via SET, pelo scanner
        System.out.println("Digite o nome do Aluno: ");
        Edu.setNome(sc.nextLine());

        //saida de dados via GET, usando SOUT
        System.out.println(Edu.getMedia());

        Edu.calcularMedia();
        System.out.println("A média do aluno é: " + Edu.calcularMedia2());

        //System.out.println("Digite a Disciplina desejada: ");
        //Edu.disciplina = sc.nextLine();
    }
}
