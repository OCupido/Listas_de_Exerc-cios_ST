package lista11.pagamento.pagamento;

import lista11.pagamento.caixa.Checkout;
import lista11.pagamento.caixa.Compra;
import lista11.pagamento.impressao.HP;
import lista11.pagamento.impressao.Impressora;

public class Main {
    public static void main(String[] args) {
        //para tezstar precisamos instanciar uma operadora uma impressora
        //um cartão do cliente, uma compra e finalm,ente instanciar um chaeckout

        Operadora operadora = new Nubank();
        Impressora impressora = new HP();
        Cartao cartao = new Cartao();
        cartao.setNomeDoClienete("Anderson");
        cartao.setNumeroCartao("1234.5678.8901");
        Compra compra = new Compra();
        compra.setNomeCliente("Anderson");
        compra.setProduto("mouse Microsoft BT 5665");
        compra.setValorCompra(299.99);
        //finalizando a compra do produto
        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharCompra(compra, cartao);
    }
}
