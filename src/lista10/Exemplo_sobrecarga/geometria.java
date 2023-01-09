package lista10.Exemplo_sobrecarga;

public class geometria {

    public double raio;
    public double ladoA;
    public double ladoB;

    //calculo do raio (círculo)
    public double calcular (double raio) {
        this.raio = 3.14 * (raio * raio);
        return this.raio;
    }
    //calculo da area do retangulo
    public double calcular (double ladoA, double ladoB){
        double area = ladoA * ladoB;
        return area;
    }

}
