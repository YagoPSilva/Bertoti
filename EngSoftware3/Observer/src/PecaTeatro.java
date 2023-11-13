import java.util.ArrayList;
import java.util.List;

public class PecaTeatro {
    private String nomePeca;
    private String horario;
    private String diretor;
    private List<Observer> observers = new ArrayList<>();

    public PecaTeatro(String nomePeca, String horario, String diretor) {
        this.nomePeca = nomePeca;
        this.horario = horario;
        this.diretor = diretor;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public void notificarObservers() {
        String mensagem = "Nova peça: " + nomePeca + ", Horário: " + horario + ", Diretor: " + diretor;
        for (Observer observer : observers) {
            observer.atualizar(mensagem);
        }
    }
}
