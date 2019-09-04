package main.java.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
    
public class Date {
    public static void main(String... args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = formatter.format(LocalDateTime.now());
        System.out.println(formattedDate);
    }
}
