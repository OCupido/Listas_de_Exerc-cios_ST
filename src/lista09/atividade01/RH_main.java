package lista09.atividade01;

public class RH_main {
    public static void main(String[] args) {

        //gerente
        gerente gerente = new gerente();
        gerente.setNome("Umberto");
        gerente.setTelefone("99236-6744");
        gerente.setData_de_admicao("09/01/2000");

        gerente.setSalario(10000.00);
        gerente.setHoras(12);
        gerente.setDias(25);

        System.out.println(gerente.getNome());
        System.out.println(gerente.getTelefone());
        System.out.println(gerente.getData_de_admicao());
        gerente.calcger();
        System.out.println("\n");

        //desenvolvedor
        desenvolvedor dev = new desenvolvedor();
        dev.setNome("Doisberto");
        dev.setTelefone("948-3567");
        dev.setData_de_admicao("10/11/2010");
        dev.setHoras(16);

        System.out.println(dev.getNome());
        System.out.println(dev.getTelefone());
        System.out.println(dev.getData_de_admicao());
        dev.calculoDV();
        System.out.println("\n");

        //empregado
        empregado emp = new empregado();
        emp.setNome("Trêsberto");
        emp.setTelefone("95496-4370");
        emp.setData_de_admicao("31/06/2001");
        emp.setSalario("Empregado Recebe: 2.500");

        System.out.println(emp.getNome());
        System.out.println(emp.getTelefone());
        System.out.println(emp.getData_de_admicao());
        System.out.println(emp.getSalario());
    }
}
