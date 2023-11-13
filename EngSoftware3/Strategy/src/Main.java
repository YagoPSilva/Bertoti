public class Main {
    public static void main(String[] args) {
        Seguro seguroVida = new SeguroVida();
        Seguro seguroCarro = new SeguroCarro();

        Cliente cliente = new Cliente("João", 30);

        cliente.setSeguro(seguroVida);
        cliente.fazerSeguro();

        cliente.setSeguro(seguroCarro);
        cliente.fazerSeguro();
    }
}
