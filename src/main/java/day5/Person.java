package day5;

public class Person {
    String name; //Global variable/Field
    int age;
    char gender;

    //Constructor => special method in a class that is automatically called when an object is cre

    //default constructor
    Person()
    {
        System.out.println("I'm the default constructor");
    }

    // Signature
    Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
}
