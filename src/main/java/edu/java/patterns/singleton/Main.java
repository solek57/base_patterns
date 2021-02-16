package edu.java.patterns.singleton;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Singleton singleton = Singleton.getSingleton();
            System.out.println(Singleton.count);

        }
    }
}
