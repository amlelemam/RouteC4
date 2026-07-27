package day6;

abstract class Shape {

    //Abstraction: hiding implementation details and showing only the essential behavior
    //Focus on => what an object does, not how it does it

    /*
    In real life: When you drive a car, you use the steering wheel and pedals (interface),
    but you don't worry about how the engine works (implementation hidden)
     */

    //Abstraction in Java => achieved through abstract classes and interfaces

    /*
    1. Abstract classes
        - Can have both abstract methods (no body) and concrete methods.
        - Can't be instantiated directly.

    2. Interfaces
        - Pure abstraction (before Java 8: only abstract methods; later: default and static methods allowed).
        - A class can implement multiple interfaces.
     */

    abstract void draw(); // abstract method

    void info() // concrete method
    {
        System.out.println("Shape");
    }
}
