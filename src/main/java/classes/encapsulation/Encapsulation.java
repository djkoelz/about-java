package main.java.classes.encapsulation;

public class Encapsulation {
    public static void main(String... args) {
        Person p = new Person("John Smith");

        System.out.println(p.getName());
    }
}

class Person {
    private String name;

    public Person(String n) {
        name = n;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }
}
