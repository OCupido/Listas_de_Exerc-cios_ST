package lista11.pagamento.pagamento;

public interface Autorizacao {
    //só preciso saber o valor total da compra, para ele ser autorizavel ou não

    public double getValorCompra();
}
