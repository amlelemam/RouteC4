package day6;

public interface Vehicle {

    void start(); // abstract

    default void stop() {
        System.out.println("Hello from Vehicle");

    }

    default void stops() {
        System.out.println("Bike stops with a kick ");
    }
}
