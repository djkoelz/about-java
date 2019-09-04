package main.java.strings;

public class Strings {
    public static void main(String... args) {
        String str = "Hello world";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf("world"));

        String first = "Hello";
        String second = "world";
        System.out.println(first + " " + second);
        System.out.println(first.concat(second));
    }
}

