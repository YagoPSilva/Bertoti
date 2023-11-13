public class ContatoModel {
    private String nome;
    private String numero;

    public ContatoModel(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
}
