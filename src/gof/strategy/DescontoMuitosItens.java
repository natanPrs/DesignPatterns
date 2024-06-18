package gof.strategy;

public class DescontoMuitosItens implements Desconto{
    @Override
    public void AplicarDesconto() {
        System.out.println("Seu carrinho passou de 5 produtos, apliando desconto de 10%!");
    }
}
