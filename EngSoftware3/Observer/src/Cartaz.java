public class Cartaz implements Observer {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Cartaz na rua: " + mensagem);
    }
}
