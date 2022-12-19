package lista07.atividade02;

import java.util.Scanner;

public class notas {

    public void media(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua Matéria: ");
        String materia = sc.nextLine();
        System.out.println("Digite a nota do 1° Trimestre");
        double num01 = sc.nextDouble();
        System.out.println("Digite a nota do 2° Trimestre");
        double num02 = sc.nextDouble();
        System.out.println("Digite a nota do 3° Trimestre");
        double num03 = sc.nextDouble();
        double resultado = 0;

        if ("Português".equalsIgnoreCase(materia)){
            resultado = (num01 + num02 + num03)/3;
        }
        else if ("Matemática".equalsIgnoreCase(materia)) {
            resultado = (num01 + num02 + num03)/3;
        }
        else if ("Quimica".equalsIgnoreCase(materia)) {
            resultado = (num01 + num02 + num03)/3;
        }
        else if ("Física".equalsIgnoreCase(materia)) {
            resultado = (num01 + num02 + num03)/3;
        }
        else if ("sociologia".equalsIgnoreCase(materia)) {
            resultado = (num01 + num02 + num03)/3;
        }
        else if ("Filosofia".equalsIgnoreCase(materia)) {
            resultado = (num01 + num02 + num03)/3;
        }
        else if ("Biologia".equalsIgnoreCase(materia)) {
            resultado = (num01 + num02 + num03)/3;
        }
        else if ("Educação Física".equalsIgnoreCase(materia)) {
            resultado = (num01 + num02 + num03)/3;
        }
        else if ("Artes".equalsIgnoreCase(materia)) {
            resultado = (num01 + num02 + num03)/3;
        }
        else if ("Inglês".equalsIgnoreCase(materia)) {
            resultado = (num01 + num02 + num03)/3;
        }
        else if ("História".equalsIgnoreCase(materia)) {
            resultado = (num01 + num02 + num03)/3;
        }
        else if ("Geografia".equalsIgnoreCase(materia)) {
            resultado = (num01 + num02 + num03)/3;
        }
        if (resultado > 7){
            System.out.println(" Sua Média em " + materia + " é " + resultado + " Você está Aprovado(a) ");
        }
        else if (resultado == 6 | resultado == 6.9) {
            System.out.println(" Sua Média em " + materia + " é " + resultado + " Você está em Recuperação ");
        }
        else if (resultado < 6) {
            System.out.println(" Sua Média em " + materia + " é " + resultado + " Você está Reprovado(a) ");
        }
    }
}
