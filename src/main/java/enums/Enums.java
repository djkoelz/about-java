package main.java.enums;

public class Enums {
    enum Temperature {
        COLD, COOL, WARM, HOT
    }
    
    public static void main(String... args) {
        Temperature temp = Temperature.HOT;
        System.out.println(temp);
    }
}


