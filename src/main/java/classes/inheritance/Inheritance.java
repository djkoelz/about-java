package main.java.classes.inheritance;

public class Inheritance {
    public static void main(String... args) {
        Student s = new Student();
        s.name = "John Smith";
        s.age = 10;
        s.setSchool("University of Fooiness");

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.getSchool());
    }
}

class Person {
    protected String name;
    protected int age;
}

class Student extends Person {
    private String school;

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String s) {
        this.school = s;
    }
}
