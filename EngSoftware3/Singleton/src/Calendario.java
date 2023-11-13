import java.util.Calendar;

public class Calendario {
    private static Calendario instancia;
    private Calendar calendario;

    private Calendario() {
        this.calendario = Calendar.getInstance();
    }

    public static Calendario getInstance() {
        if (instancia == null) {
            instancia = new Calendario();
        }
        return instancia;
    }

    public String obterDataAtual() {
        return "Data Atual: " + calendario.getTime();
    }
}
