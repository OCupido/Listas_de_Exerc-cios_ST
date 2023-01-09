package lista10.Exemplo_sobrecarga;

import java.util.Scanner;

/* Sobrecarga (overldad)
é a possibilidade de se reutilizar métodos com o mesmo nome mas com assinatura diferentes, dentro da mesma classe
é uma das formas de se utilizar o polimorfismo (muitas formas)
  */
public class geometria_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        geometria g = new geometria();

        System.out.println("valor do raio: ");
        double r = sc.nextDouble();
        System.out.println("area calculada: " + g.calcular(r));

        System.out.println("informe os dois lados do retangulo:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("area do retangulo:" + g.calcular(a,b));
    }
}
