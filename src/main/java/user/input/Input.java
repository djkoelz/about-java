package main.java.user.input;

import java.util.Scanner;

public class Input {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username");

        String username = scanner.nextLine();
        System.out.println(username);

        scanner.close();
    }
}
