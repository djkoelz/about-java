package main.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String... args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Hyundai");
        cars.add("Ford");

        Collections.sort(cars);
        
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println(cars.get(0));
        cars.set(0, "Toyota");
        System.out.println(cars.get(0));


        cars.clear();
    }
}
