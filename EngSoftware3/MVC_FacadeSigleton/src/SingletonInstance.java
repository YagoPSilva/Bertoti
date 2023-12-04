public class SingletonInstance {
    private static View instance;

    public static View getInstance() {
        if (instance == null) {
            instance = new View();
        }
        return instance;
    }
}