package Lista06;
import java.util.Scanner;
public class atividade01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Digite o numero do mês: ");
        int mes = sc.nextInt();
        int dias = 0;
        System.out.println("Digite o ano que deseja: ");
        int ano = sc.nextInt();

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                System.out.println("Número de dias: " + dias);
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                System.out.println("Número de dias: " + dias);
                break;
            case 2:
                if ((ano % 4 == 0) && !(ano % 100 ==0) || (ano %400 == 0))
                dias = 29;
                else
                dias = 28;
                System.out.println("Número de dias: " + dias);
                break;
            default:
                System.out.println("Esse mês não existe");
                break;
        }
    }
}
