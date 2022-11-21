package Lista01;

public class atividade04 {
    public static void main(String[] args) {

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
    }
}
