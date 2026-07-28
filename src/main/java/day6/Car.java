package day6;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car start with a key");
    }

    @Override
    public void stop() {
        System.out.println("Car stop with a key");
    }

}