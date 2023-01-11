package lista11.pagamento.caixa;

import lista11.pagamento.impressao.Imprimivel;
import lista11.pagamento.pagamento.Autorizacao;
import lista11.pagamento.pagamento.Operadora;

public class Compra implements Imprimivel, Autorizacao {
    //Além dos dados de compra do produto devemos implementar os metodos das duas INterfaces

    private double valorCompra;
    private String produto;
    private String nomeCliente;

    @Override
    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String getCabecalhoNF() {
        return this.getNomeCliente();
    }

    @Override
    public String getCorpoNF() {
        return this.produto + " = " + this.getValorCompra();
    }
}
