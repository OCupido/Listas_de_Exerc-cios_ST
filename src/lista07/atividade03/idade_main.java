package lista07.atividade03;
import java.util.Scanner;
public class idade_main {
    public static void main(String[] args) {

        idade idd = new idade();
        Scanner sc = new Scanner(System.in);
        do {

            idd.comparacao();
            System.out.println("Deseja continuar vendo as idades? \n S/N");

        }while (sc.nextLine().equalsIgnoreCase("s"));
    }
}
