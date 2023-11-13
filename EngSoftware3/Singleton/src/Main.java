public class Main {
    public static void main(String[] args) {
        Calendario calendario = Calendario.getInstance();

        String dataAtual = calendario.obterDataAtual();
        System.out.println(dataAtual);

    }
}
