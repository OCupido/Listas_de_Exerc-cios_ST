package lista09.atividade01;

public class desenvolvedor extends pessoa{

    private double horas;

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "desenvolvedor{" +
                "horas: " + horas +
                '}';
    }


    public double calculoDV(){
        double calculardv = (horas * 255);
        System.out.println("Desenvolvedor recebe: " + calculardv);
        return 0;
    }
}
