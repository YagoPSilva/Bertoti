public class Main {
    public static void main(String[] args) {
        AgendaModel agenda = new AgendaModel();
        TelaListaTelefonicaView telaListaTelefonica = new TelaListaTelefonicaView(agenda);
        AdicionarContatoController adicionarContatoController = new AdicionarContatoController(agenda);

        adicionarContatoController.adicionarContato("João", "123456789");
        adicionarContatoController.adicionarContato("Maria", "987654321");
        adicionarContatoController.adicionarContato("Carlos", "555555555");

        System.out.println("\nLista Telefônica Inicial:");
        telaListaTelefonica.mostrarContatos();

        // Adicionando um novo contato
        adicionarContatoController.adicionarContato("Ana", "111111111");

        // Exibindo a lista telefônica após a adição
        System.out.println("\nLista Telefônica Após Adição:");
        telaListaTelefonica.mostrarContatos();
    }
}
