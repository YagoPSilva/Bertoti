public class App implements Observer {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("App: " + mensagem);
    }
}
