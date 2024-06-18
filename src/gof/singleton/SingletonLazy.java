package gof.singleton;

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){

    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

    public void mensagem() {
        System.out.println("Oi, Singleton foi instanciado e por isso eu pude ser chamado");


}}
