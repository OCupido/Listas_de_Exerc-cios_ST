package lista09.atividade01;

public class gerente extends pessoa{

    private double salario;
    private double horas;
    private double dias;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getDias() {
        return dias;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "gerente{" +
                "salario=" + salario +
                ", horas=" + horas +
                ", dias=" + dias +
                '}';
    }

    public double calcger(){
        double calcularger = (salario + horas + dias);
        System.out.println("Gerente recebe: " + calcularger);
        return 0;
    }
}
