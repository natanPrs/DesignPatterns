package gof.strategy;

public class DescontoCupom implements Desconto{
    @Override
    public void AplicarDesconto() {
        System.out.println("Voce aplicou o cupom de 5%, apliando desconto de 5%!");
    }
}
