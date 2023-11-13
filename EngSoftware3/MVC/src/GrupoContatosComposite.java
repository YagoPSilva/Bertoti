import java.util.ArrayList;
import java.util.List;

public class GrupoContatosComposite {
    private String nomeGrupo;
    private List<ContatoModel> contatosNoGrupo = new ArrayList<>();

    public GrupoContatosComposite(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public void adicionarContato(ContatoModel contato) {
        contatosNoGrupo.add(contato);
    }

    public String getNome() {
        return nomeGrupo;
    }

    public List<ContatoModel> getContatosNoGrupo() {
        return contatosNoGrupo;
    }
}
