package edu.java.patterns.builder;

public class Person {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
    }

    public static class Builder {

        private String name;
        private Integer age;

        public Builder(String n) {
            this.name = n;
        }

        public Builder age(Integer a) {
            this.age = a;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }
}
