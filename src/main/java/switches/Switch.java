package main.java.switches;

public class Switch {
    public static void main(String... args) {
        for (int i = 0; i < 10; i++) {
            switch (i % 2) {
            case 0:
                System.out.println(i + " is even");
                break;
            case 1:
                System.out.println(i + " is odd");
                break;
            default:
                System.out.println(i + " is not a number");
            }
        }
    }
}
