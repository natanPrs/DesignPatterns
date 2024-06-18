package gof.strategy;

public class DescontoAcimaDe100 implements Desconto {
    @Override
    public void AplicarDesconto() {
        System.out.println("Seu carrinho passou dos R$100 Reais, apliando desconto de 15%!");
    }
}
