package gof.strategy;

public class CarrinhoDeCompras {
    private Desconto desconto;

    public void setDesconto(Desconto desconto){
        this.desconto = desconto;
    }
    public void aplicarDesconto() {
        desconto.AplicarDesconto();
    }
}
