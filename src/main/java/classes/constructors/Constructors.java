package main.java.classes.constructors;

public class Constructors {
    public static void main(String... args) {
        Foo f = new Foo(10,5);
        System.out.println(f.a);
        System.out.println(f.b);
    }
}

class Foo {
    int a;
    int b;
    
    public Foo(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
