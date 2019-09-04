package main.java.classes.methods;

public class Methods {
    public static void main(String... args) {
        Foo f = new Foo();
        f.method();
        Foo.stMethod();
    }
}

class Foo {
    public void method() {
        System.out.println("Called method");
    }

    public static void stMethod() {
        System.out.println("Called a static method");
    }
}
