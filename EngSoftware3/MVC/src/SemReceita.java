public class SemReceita implements Compra {
    private View view;
    private Estoque estoque;

    public void setCompra(View view){
        this.view = view;
        view.setCompra(this);
    }

    public void efetuarCompra(){
        view.imprimirDadosRemedio();
        view.imprimirReceita();
    }
}