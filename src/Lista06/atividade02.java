package Lista06;
import java.util.Scanner;
public class atividade02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Digite a taboada desejada: ");
        int tabuada = sc.nextInt();
        System.out.println("tabuada do: " + tabuada);
        for (int i = 0; i < 11 ; i++){
            System.out.println(tabuada + "x" + i + "=" + i * tabuada);
        }
    }
}