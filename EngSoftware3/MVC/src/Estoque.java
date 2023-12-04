
import java.util.LinkedList;
import java.util.List;

public class Estoque implements Subject{
    private List remedios;
    private List observers;

    public Estoque(){
        remedios = new LinkedList();
        observers = new LinkedList();
    }



    public void registerObserver(Observer o){
        observers.add(o);
    }


    public void notifyObservers(List encontrados){
        for(Object i: observers){
            Observer ob = (Observer)i;
            ob.update(encontrados);
        }
    }

    public void addRemedio(Remedio remedio){
        remedios.add(remedio);
    }

    public void buscarRemedio(Remedio remedio){
        List encontrados = new LinkedList();
        for(Object i: remedios){
            Remedio remedioEstoque = (Remedio)i;
            if(remedioEstoque.matches(remedio)) encontrados.add(remedioEstoque);
        }
        notifyObservers(encontrados);
    }

}