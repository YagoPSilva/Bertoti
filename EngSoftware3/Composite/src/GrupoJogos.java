import java.util.ArrayList;
import java.util.List;

class GrupoJogos implements Jogos {
    private List<Jogos> children = new ArrayList<>();

    public void adicionarJogo(Jogos jogo) {
        children.add(jogo);
    }

    public void removerJogo(Jogos jogo) {
        children.remove(jogo);
    }

    public void setJogos(List<Jogos> jogos) {
        this.children = jogos;
    }

    @Override
    public void mostrarDetalhes() {
        for (Jogos jogo : children) {
            jogo.mostrarDetalhes();
        }
    }
}