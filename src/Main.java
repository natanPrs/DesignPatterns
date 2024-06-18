import gof.facade.Amplifier;
import gof.facade.DVDPlayer;
import gof.facade.HomeTheaterFacade;
import gof.facade.Projector;
import gof.singleton.SingletonLazy;
import gof.strategy.*;

public class Main {
    public static void main(String[] args) {
        //Singleton ------------------
        SingletonLazy singleton = SingletonLazy.getInstancia();

        singleton.mensagem();


        //Strategy -------------------
        Desconto acima100 = new DescontoAcimaDe100();
        Desconto cupom = new DescontoCupom();
        Desconto muitosItens = new DescontoMuitosItens();

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.setDesconto(acima100);
        carrinho.aplicarDesconto();

        carrinho.setDesconto(cupom);
        carrinho.aplicarDesconto();

        carrinho.setDesconto(muitosItens);
        carrinho.aplicarDesconto();


        //Facade ---------------------
        DVDPlayer dvdPlayer = new DVDPlayer();
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, amplifier, projector);

        homeTheater.watchMovie("Interstellar");
        homeTheater.endMovie();



    }
}