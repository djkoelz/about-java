package main.java.classes.interfaces;

public class Interfaces {
    public static void main(String... args) {
        Animal dog = new Dog();
        dog.speak();
        dog.run();
    }
}

interface Animal {
    public void speak();
    public void run();
}

class Dog implements Animal {
    public void speak() {
        System.out.println("woof");
    }

    public void run() {
        System.out.println("dog running...");
    }
}

