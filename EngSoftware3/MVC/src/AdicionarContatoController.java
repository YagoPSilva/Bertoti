public class AdicionarContatoController {
    private AgendaModel agenda;

    public AdicionarContatoController(AgendaModel agenda) {
        this.agenda = agenda;
    }

    public void adicionarContato(String nome, String numero) {
        ContatoModel novoContato = new ContatoModel(nome, numero);
        agenda.adicionarContato(novoContato);
    }
}
