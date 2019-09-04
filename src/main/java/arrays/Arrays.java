package main.java.arrays;

public class Arrays {
    public static void main(String... args) {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int n : numbers) {
            System.out.println(n);
        }

        numbers[0] = 10;
    }
}

    
