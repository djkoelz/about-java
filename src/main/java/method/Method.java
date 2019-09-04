package main.java.method;

public class Method {
    static void foo() {
        System.out.println("Called this method");
    }

    static void bar(String msg) {
        System.out.println(msg);
    }

    static int sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        return sum;
    }
    
    public static void main(String... args) {
        foo();
        bar("Hello world");
        int[] numbers = {1,2,3,4};
        System.out.println(sum(numbers));
    }
}
