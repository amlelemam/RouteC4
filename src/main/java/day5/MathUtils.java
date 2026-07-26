package day5;

public class MathUtils {

    //Polymorphism = "Many Forms"

    // It allows the same method name or same interface to represent different underlying behaviors.

    //1- Compile-time Polymorphism (Method Overloading)

    /*
    - Same method name, different parameter lists (different signatures).
    - Decision made at **compile time**.
    */

    int add(int a, int b) {

        System.out.println(" Int version of add method is called ");
        return a + b;
    }

    double add(double a, double b) {
        System.out.println(" double  version of add method is called ");
        return a + b;
    }

}
