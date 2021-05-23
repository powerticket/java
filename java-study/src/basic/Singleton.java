package basic;

public class Singleton {
    private static Singleton singleton;
    private Singleton() {}
    public static Singleton getSiingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
