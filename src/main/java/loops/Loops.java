package main.java.loops;

public class Loops {
    public static void main(String... args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        i = 0;
        do {
            System.out.println(i);
        } while(++i < 10);

        for (i = 0; i < 10; i++) {
            if (i > 5)
                break;
        }

        for (i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i + " is odd");
        }
    }
}
