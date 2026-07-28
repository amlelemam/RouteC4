package day6;

public class Main {
    public static void main(String[] args) {

//        Shape s1 = new Circle();
//        s1.draw();
//        Shape s2 = new Square();
//        s2.draw();
//        s2.info();

//        Vehicle v1 = new Car();
//        Vehicle v2 = new Bike();
//
//        v1.start();
//        v2.start();

//        Animal[] animals ={ new Dog(), new Cat(), new Cow() };
//
//        for (Animal animal : animals) {
//            animal.makeSound();
//
//        }

        Calculator calculator = new Calculator();

        calculator.add(1, 2);
        calculator.add(3, 4, 5);
        calculator.add(5.6, 7.6);
        double x = calculator.add(5.6, 7.6);
        System.out.println(x);
    }

}
