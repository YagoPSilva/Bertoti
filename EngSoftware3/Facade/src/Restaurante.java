class Restaurante {
    private GestorDeMesa gestorDeMesa;
    private GestorDePagamento gestorDePagamento;

    public Restaurante() {
        this.gestorDeMesa = new GestorDeMesa();
        this.gestorDePagamento = new GestorDePagamento();
    }

    public void fazerPedido(int numeroMesa, double valor) {
        System.out.println("Servindo mesa: " + numeroMesa);
        gestorDeMesa.servirMesa(numeroMesa);
        gestorDePagamento.realizarPagamento(valor);
    }
}