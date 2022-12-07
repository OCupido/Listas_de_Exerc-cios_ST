package Lista05;

public class atividade01 {
    public static void main(String[] args) {

        double temperatura = 57;
        char unidade = 'F';
        double conversor;

        if (unidade == 'C') {
            conversor = temperatura * 1.8 + 32;
            System.out.printf("A temperatura informada foi %.1f ºC. \n Ela equivale a %.2fºF.",
                    temperatura, conversor);
        } else if (unidade == 'F') {
            conversor = (temperatura - 32) / 1.8;
            System.out.printf("A temperatura informada foi %.1fºF. \n Ela equivale a %.2fºC.",
                    temperatura, conversor);
        } else {
            System.out.printf("A letra %s não corresponde a uma unidade de medida de temperatura.", unidade);
        }
    }
}