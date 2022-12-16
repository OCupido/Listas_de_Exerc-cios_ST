package lista07.atividade01;

public class calculos {

    int numero;
    int op;
    int resultado;

    public void Multiplicar () {resultado = numero * op;
        System.out.println(numero + " X " + op + " = " + resultado);}
    public void Divisao () { resultado = numero / op;
        System.out.println(numero + " / " + op + " = " + resultado);}
    public void soma() { resultado = numero + op;
        System.out.println(numero + " + " + op + " = " + resultado);}
    public void subtracao () {resultado = numero - op;
        System.out.println(numero + " - " + op + " = " + resultado);}

}
