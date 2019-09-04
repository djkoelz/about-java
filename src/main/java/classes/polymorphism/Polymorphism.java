package main.java.classes.polymorphism;

public class Polymorphism {
    public static void main(String... args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.speak();
        dog.speak();
        cat.speak();
    }
}

class Animal {
    public void speak() {
        System.out.println("foo");
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
