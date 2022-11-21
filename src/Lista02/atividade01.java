package Lista02;

public class atividade01 {
    public static void main(String[] args) {

        System.out.println("1. Determinar se um aluno passou de ano.");
        double ps = 5;
        double ss = 8;
        double ts = 6;
        double qs = 7;
        double result = (ps + ss + ts + qs) / 4;
        if (result >= 6) System.out.println(" Sua nota foi " + result +" Parabéns você passou! " + "\n");
        else if (result < 6) {
            System.out.println("Sua nota foi " + result + " Reprovado(a), estude mais." + "\n");
        }
    }
}
