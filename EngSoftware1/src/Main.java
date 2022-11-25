import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Arma a1 = new Arma("IA2", "Fuzil", "5.56", 25);
        Arma a2 = new Arma("AK-47", "Fuzil", "7.62", 40);
        Arma a3 = new Arma("Browning", "Metralhadora", ".50", 5);
        Arma a4 = new Arma("Beretta", "Pistola", "9mm", 30);

        Municao m1 = new Municao("7.62", "B", "1999-09-09", 1500);
        Municao m2 = new Municao("5.56", "A", "2018-05-20", 800);
        Municao m3 = new Municao(".50", "B", "2005-04-09", 500);
        Municao m4 = new Municao("9mm", "A", "2010-06-15", 1000);
        Municao m5 = new Municao("9mm", "B", "2010-06-16", 2600);

        ArrayList<Arma> la = new ArrayList<Arma>();
        la.add(a1);
        la.add(a2);
        la.add(a3);
        la.add(a4);

        ArrayList<Municao> lm = new ArrayList<Municao>();
        lm.add(m1);
        lm.add(m2);
        lm.add(m3);
        lm.add(m4);
        lm.add(m5);

        ReservaArmamento r1 = new ReservaArmamento(la, lm);

        r1.contarArmas();
        r1.contarMunicao();

    }
}
