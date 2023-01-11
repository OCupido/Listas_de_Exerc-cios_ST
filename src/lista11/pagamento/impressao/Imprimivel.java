package lista11.pagamento.impressao;

public interface Imprimivel {
    //quero indicar o que pode ser impresso na impressora

    public String getCabecalhoNF();
    public String getCorpoNF();

    //não importa quais são os dados imprimiveis,
    //só preciso definir quais partes são imprimiveis
}
