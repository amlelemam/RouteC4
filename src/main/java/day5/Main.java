package day5;

import day4.Rectangle;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person( "Ahmed",27, 'm');

        BankAccount bankAccount = new BankAccount(1000);
        bankAccount.getBalance();
        bankAccount.deposit(500);
        bankAccount.getBalance();

        Student s = new Student("Ahmed", 85);
        System.out.println("Student Name : " + s.getName());
        s.setGrade(90);
        System.out.println("Grade updated to 90 successfully.");

        Animal[] animals = { new Dog(), new Cat(), new Cow() };

        for (Animal animal : animals)
        {
            animal.makeSound();
        }

        Car myCar = new Car("BMW", 2025);
        System.out.println("Brand: " + myCar.brand + " and Year: " + myCar.year);
        myCar.start();
        myCar.honk();
        System.out.println();

        Bike myBike = new Bike("Bike", 2023);
        System.out.println("Brand: " + myBike.brand + " and Year: " + myBike.year);
        myBike.start();
        myBike.ringBell();

        MathUtils mathUtils = new MathUtils();
        mathUtils.add(2,4);
        mathUtils.add(2.7,4);


        Shape[] shapes = { new Circle(), new Square(), new Triangle() };

        for (Shape shape : shapes) {
            shape.draw();
        }

    }
}