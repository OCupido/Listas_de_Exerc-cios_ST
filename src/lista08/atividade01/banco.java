package lista08.atividade01;

public class banco {

    private double numeroDaConta;
    private double saldo;
    private double debito;
    private double credito;
    private double calculo;

    public double getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(double numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }

    public double getNumeroDaConta(String s) {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCalculosaldo() {
        return calculo;
    }

    public void setCalculosaldo(double calculosaldo) {
        this.calculo = calculosaldo;
    }

    public double calcularSaldo(){
        calculo = (saldo - debito + credito);
        return calculo;
    }
}
