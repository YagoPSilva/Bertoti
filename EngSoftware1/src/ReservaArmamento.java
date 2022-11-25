import java.util.ArrayList;

public class ReservaArmamento {
    private ArrayList<Arma> armas;
    private ArrayList<Municao> municoes;

    public ReservaArmamento(ArrayList<Arma> armas, ArrayList<Municao> municoes) {
        this.armas = armas;
        this.municoes = municoes;
    }

    public void contarArmas() {
        int fuzis = 0;
        int pistolas = 0;
        int metralhadoras = 0;
        int total = 0;

        for (Arma arma : armas) {
            switch (arma.getTipo()) {
                case "Fuzil" -> fuzis += arma.getQuantidade();
                case "Pistola" -> pistolas += arma.getQuantidade();
                case "Metralhadora" -> metralhadoras += arma.getQuantidade();
            }
            total += arma.getQuantidade();
        }

        System.out.println("Quantidade de armamentos:");
        System.out.println("Fuzil - " + fuzis);
        System.out.println("Pistola - " + pistolas);
        System.out.println("Metraladora: - " + metralhadoras);
        System.out.println("Total - " + total);
        System.out.println("__________________________________________");
    }

    public void contarMunicao() {
        int mun9 = 0;
        int mun556 = 0;
        int mun50 = 0;
        int mun762 = 0;
        int total = 0;

        for (Municao municao : municoes) {
            switch (municao.getCalibre()) {
                case "9mm" -> mun9 += municao.getQuantidade();
                case "5.56" -> mun556 += municao.getQuantidade();
                case "7.62" -> mun762 += municao.getQuantidade();
                case ".50" -> mun50 += municao.getQuantidade();
            }
            total += municao.getQuantidade();
        }

        System.out.println("Quantidade de munições:");
        System.out.println("9mm - " + mun9);
        System.out.println("5.56 - " + mun556);
        System.out.println("7.62 - " + mun762);
        System.out.println(".50 - " + mun50);
        System.out.println("Total - " + total);
        System.out.println("__________________________________________");
    }
}

