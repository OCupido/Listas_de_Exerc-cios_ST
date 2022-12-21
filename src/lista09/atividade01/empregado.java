package lista09.atividade01;

public class empregado extends pessoa{

    private String salario;

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "empregado{" +
                "salario: '" + salario + '\'' +
                '}';
    }
}
