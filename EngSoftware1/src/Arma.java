public class Arma {
    private String nome;
    private String tipo;
    private String calibre;
    private int quantidade;

    public Arma(String nome, String tipo, String calibre, int quantidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.calibre = calibre;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCalibre() {
        return calibre;
    }

    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
