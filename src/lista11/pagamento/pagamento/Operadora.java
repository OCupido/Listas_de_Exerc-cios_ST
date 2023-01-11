package lista11.pagamento.pagamento;

public interface Operadora {
    //não sei qual é a operadora do cartão. só preciso saber se ela vai autorizar a compra ou não

    public boolean autorizar (Autorizacao autorizacao, Cartao cartao);
}
