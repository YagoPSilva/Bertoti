import java.util.ArrayList;
import java.util.List;

public class AgendaModel {
    private List<ContatoModel> contatos = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void adicionarContato(ContatoModel contato) {
        contatos.add(contato);
        notificarObservers();
    }

    public List<ContatoModel> getContatos() {
        return contatos;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.atualizar(this);
        }
    }
}
