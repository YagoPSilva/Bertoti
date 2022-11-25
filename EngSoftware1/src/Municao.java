public class Municao {
    private String calibre;
    private String lote;
    private String dataFabricacao;
    private int quantidade;

    public Municao(String calibre, String lote, String dataFabricacao, int quantidade) {
        this.calibre = calibre;
        this.lote = lote;
        this.dataFabricacao = dataFabricacao;
        this.quantidade = quantidade;
    }

    public String getCalibre() {
        return calibre;
    }

    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
