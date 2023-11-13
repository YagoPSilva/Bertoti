public class Main {
    public static void main(String[] args) {
        Observer cartazRua = new Cartaz();
        Observer app = new App();
        Observer facebook = new Facebook();

        PecaTeatro pecaTeatro = new PecaTeatro("A Peça", "19:30", "Diretor X");

        pecaTeatro.addObserver(cartazRua);
        pecaTeatro.addObserver(app);
        pecaTeatro.addObserver(facebook);

        pecaTeatro.notificarObservers();

        pecaTeatro.removeObserver(cartazRua);

        pecaTeatro.notificarObservers();
    }
}
