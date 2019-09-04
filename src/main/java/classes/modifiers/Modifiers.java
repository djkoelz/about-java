package main.java.classes.modifiers;

public class Modifiers {
    public static void main(String... args) {
        Foo f = new Foo();
        f.method();
    }
}

class Foo {
    private int privAttr = 10;
    
    public void method() {
        bar("Hello");
    }

    private void bar(String msg) {
        System.out.println(msg + " " + privAttr);
    }
}
