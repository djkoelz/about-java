package main.java.classes.attributes;

public class Attributes {
    public static void main(String... args) {
        Person p = new Person();
        System.out.println(p.name + " " + p.age);
    }
}

class Person {
    String name = "Person's Name";
    int age = 30;
}
