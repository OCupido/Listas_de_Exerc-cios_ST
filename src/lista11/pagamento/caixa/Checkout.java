package lista11.pagamento.caixa;

import lista11.pagamento.impressao.Impressora;
import lista11.pagamento.pagamento.Cartao;
import lista11.pagamento.pagamento.Operadora;

public class Checkout {
    //finalizar a compra após ela ser autorizada pelo cartão
    //ela vai ter um metodo de fechar a compra, que vai receber uma compra e um cartão

    private Operadora operadora;
    private Impressora impressora;

    public Checkout(Operadora operadora, Impressora impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }

    public Impressora getImpressora() {
        return impressora;
    }

    public void setImpressora(Impressora impressora) {
        this.impressora = impressora;
    }

    //Para fechar a compra, eu preciso receber uma compra e um cartão, alem de verificar se ele esta atorizado ou n

    public void fecharCompra (Compra compra, Cartao cartao){
        boolean autorizado = this.operadora.autorizar(compra, cartao);

        if (autorizado){
            this.impressora.imprimir(compra);
        }
        else {
            System.out.println("Compra não Autorizada");
        }
    }
    //se autorizado, eu posso imprimir um documento imprimivel (alguem que segue o contrato) como compra
    // tem implementação da interface imprimivel, eu tbm posso passar "comprar" como documento imprimivel
}
