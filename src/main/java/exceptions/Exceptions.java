package main.java.exceptions;

public class Exceptions {
    public static void main(String... args) {
        int[] numbers = {0,1,2};
        try {
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

    
