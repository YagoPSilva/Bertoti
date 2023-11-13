import java.util.Collections;
import java.util.List;

public class EstrategiaOrdenacaoPorNome implements EstrategiaOrdenacao {
    @Override
    public void ordenar(List<ContatoModel> contatos) {
        Collections.sort(contatos, (c1, c2) -> c1.getNome().compareToIgnoreCase(c2.getNome()));
    }
}
