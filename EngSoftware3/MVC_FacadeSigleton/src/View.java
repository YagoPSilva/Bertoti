
import java.util.List;

public class View implements Observer{
    private Compra compra;
    private List listaRemedios;

    public View(){
        compra = new ComReceita();
    }

    public void setCompra(Compra compra){
        this.compra = compra;
    }

    public void update(List lista){
        listaRemedios = lista;
        compra.efetuarCompra();

    }

    public void imprimirDadosRemedio(){
        if(!listaRemedios.isEmpty()){
            for(Object i: listaRemedios){
                Remedio remedio = (Remedio)i;
                System.out.println(remedio.getNome()+" "+remedio.getLaboratorio()+" "+remedio.getDosagem()+" "+remedio.getValor());
            }
        }

    }

    public void imprimirReceita(){
        System.out.println("Dados da receita...");
        System.out.println("Médico ....");
        System.out.println("Valor total ....");
    }


}