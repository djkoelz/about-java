package main.java.classes.abstraction;

public class Abstraction {
    public static void main(String... args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.speak();
        cat.speak();

        dog.sleep();
    }
}

abstract class Animal {
    public abstract void speak();
    public void sleep() {
        System.out.println("ZzZ");
    }
}

class Dog extends Animal {
    public void speak() {
        System.out.println("woof");
    }
}

class Cat extends Animal {
    public void speak() {
        System.out.println("meow");
    }
}
