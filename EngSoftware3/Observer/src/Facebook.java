public class Facebook implements Observer {
    @Override
    public void atualizar(String mensagem) {
            System.out.println("Facebook: " + mensagem);
    }
}
