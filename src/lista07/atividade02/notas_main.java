package lista07.atividade02;

import java.util.Scanner;

public class notas_main {
    public static void main(String[] args) {

        notas not = new notas();
        Scanner sc = new Scanner(System.in);
        do {
            not.media();
            System.out.println("Deseja ver outras Notas? S/N");
        }
        while (sc.nextLine().equalsIgnoreCase("s"));
    }
}
