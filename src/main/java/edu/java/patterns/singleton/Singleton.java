package edu.java.patterns.singleton;

public class Singleton {
    static int count = 0;

    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        ++count;
        if (singleton == null) {
            return new Singleton();
        }
        return singleton;
    }
}
