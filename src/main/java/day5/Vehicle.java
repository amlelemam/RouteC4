package day5;

/*
- Create a 'Vehicle' superclass:
    - Fields: 'brand' , 'year'
    - Method: 'start()' prints 'Vehicle started'
- Create subclasses:
    - 'Car' add method 'hank()'
    - 'Bike' add method 'ringBell()'
- Instantiate both and demonstrate inherited + own methods.
 */

class Vehicle {
    String brand;
    int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year  = year;
    }

    public void start() {
        System.out.println(brand + " Vehicle started");
    }
}

class Car extends Vehicle {

    public Car(String brand, int year) {
        super(brand, year);
    }

    public void honk() {
        System.out.println(brand + " Car honked");
    }
}

class Bike extends Vehicle {

    public Bike(String brand, int year) {
        super(brand, year);
    }

    public void ringBell() {
        System.out.println(brand + " Bike ringBell");
    }
}
