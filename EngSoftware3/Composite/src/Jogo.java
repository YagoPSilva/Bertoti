class Jogo implements Jogos {
    private String nome;
    private String lancamento;
    private String genero;

    public Jogo(String nome, String lancamento, String genero) {
        this.nome = nome;
        this.lancamento = lancamento;
        this.genero = genero;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Jogo: " + nome + ", Lançamento: " + lancamento + ", Gênero: " + genero);
    }
}