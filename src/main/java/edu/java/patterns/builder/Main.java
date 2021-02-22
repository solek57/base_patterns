package edu.java.patterns.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder("Dmitry").age(100).build();
        System.out.println(person.toString());
    }
}
