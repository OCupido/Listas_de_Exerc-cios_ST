package Lista01;

public class atividade02 {
    public static void main(String[] args) {
        int fileiras = 10;
        int cadeiras = 8;
        int capacidade = fileiras * cadeiras;
        int deficientes = (capacidade * 10) / 100;

        System.out.println("capacidade é: " + capacidade );
        System.out.println("espaço de deficiente é: " + deficientes + "\n");
    }
}
