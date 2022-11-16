public class atividades {
    public static void main (String[] args) {
        //Atividade 1
        int ano = 2003;
        int idade = 2022;
        int resut = idade - ano;

        System.out.println( "sua idade é " + resut + "\n");

        //Atividade 2
        int fileiras = 10;
        int cadeiras = 8;
        int capacidade = fileiras * cadeiras;
        int deficientes = (capacidade * 10) / 100;

        System.out.println("capacidade é: " + capacidade );
        System.out.println("espaço de deficiente é: " + deficientes + "\n");

        //Atividade 3
        double km = 1.5;
        double milhas = 0.6214 * km;

        System.out.println("o valor em milhas é: " + milhas + "\n");

        //Atividade 4
        double dolar = 5.17;
        double euro = 5.17;
        double libra = 5.87;
        double pesoArgentino = 0.032;
        double coroaTcheca = 0.21;
        double real = 10;

        double dr = real * dolar;
        double er = euro * real;
        double lr = libra * real;
        double par = pesoArgentino * real;
        double ctr = coroaTcheca * real;

        System.out.println( real + " reais está " + dr + " Dólars ");
        System.out.println( real + " reais está " + er + " Euros ");
        System.out.println( real + " reais está " + lr + " Libras ");
        System.out.println( real + " reais está " + par + " Pesos Argentinos ");
        System.out.println( real + " reais está " + ctr + " Coroas Tchecas \n");

        //Atividade 5
        double gcelcius = 32.5;
        double fare = 90.5;
        double val = (32.5 * 9/5) + 32;
        System.out.println(gcelcius + " Graus Celcius é " + fare + "Farenheit\n");

        //atividade 6
        double largura = 10;
        double comprimento = 20;
        double profundidade = 1.8;
        double litros = largura * comprimento * profundidade * 1000;

        System.out.println("cabem " + litros + " litros ");
    }
}