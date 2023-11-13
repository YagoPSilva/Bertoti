import java.util.List;

public class TelaListaTelefonicaView implements Observer {
    private AgendaModel agenda;

    public TelaListaTelefonicaView(AgendaModel agenda) {
        this.agenda = agenda;
        agenda.addObserver(this);
    }

    public void mostrarContatos() {
        List<ContatoModel> contatos = agenda.getContatos();
        for (ContatoModel contato : contatos) {
            System.out.println("Nome: " + contato.getNome() + ", Número: " + contato.getNumero());
        }
    }

    @Override
    public void atualizar(AgendaModel agenda) {
        System.out.println("Lista telefônica atualizada!");
        mostrarContatos();
    }
}
