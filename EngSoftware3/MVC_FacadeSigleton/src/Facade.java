import java.util.List;

public class Facade {
    private Estoque estoque;
    private View view;

    public Facade(Estoque estoque, View view) {
        this.estoque = estoque;
        this.view = view;
    }

    public void compraComReceita(List<Remedio> remedios) {
        ComReceita compra = new ComReceita();
        compra.setCompra(view);
        realizarView(remedios);
        compra.efetuarCompra();
    }

    public void compraSemReceita(List<Remedio> remedios) {
        SemReceita compra = new SemReceita();
        compra.setCompra(view);
        realizarView(remedios);
        compra.efetuarCompra();
    }

    private void realizarView(List<Remedio> remedios) {
        estoque.notifyObservers(remedios);
    }
}