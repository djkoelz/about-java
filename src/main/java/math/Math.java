package main.java.math;

public class Math {
    public static void main(String... args) {
        int a = 10;
        int b = 5;
        int sum = a + b;
        int diff = a - b;
        int fact = a * b;
        int ratio = a / b;
        int mod = a % b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(fact);
        System.out.println(ratio);
        System.out.println(mod);

        a++;
        b--;

        System.out.println(a);
        System.out.println(b);
    }
}
