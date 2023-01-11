package lista11.exemplo_interfaces;

// Interface: se trata de um "contrato" que grandes aplicações fazem para o programador sigão padrão do projeto no
// inicio do desenvolvedor
//1° -> declarar a classe com a palavra interface
//2° -> só pode conter as assinaturas dos metodos, sem corpo
//3° -> nõa pode ser instanciada
//4° -> A classe que implementa a interface deve implementar todos os seus metodos
//5° -> uma classe pode implememntar MAIS DE UMA INTERFACE
//ex: Public class ContaCorrente extends Conta
//    Public class ContaCorrente implements conta, usuario
//6° -> Uma interface pode implementar/extender diversas outras interfaces(ou seja adicionar compolrtamentos e metodos
// "a mais", aumentando as obrigatoriedades do "contrato"
public class funcionario_main
{
    public void calcularSalariodeFuncionario(funcionario funcionario){
        if (funcionario instanceof gerente){
            //calculo do gerente
        }
        else {
            System.err.println(" A classe não implementa a interfaceDAO, nenhum procedimento foi executado.");
            //calculo do admnistrador
        }
    }
    public static void main(String[] args) {

        funcionario func01 = new funcionario();
        gerente ger01 = new gerente();
        String nome = "Anderson";




    }
}
