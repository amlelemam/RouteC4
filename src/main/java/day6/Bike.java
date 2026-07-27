package day6;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike start with a key");
    }
    @Override
    public void stop() {
        System.out.println("Bike stops with a key");

    }
}