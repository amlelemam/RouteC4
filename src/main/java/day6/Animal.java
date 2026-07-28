package day6;

/*
- Create an abstract class 'Animal' with 'makeSound()' as abstract.
- Subclasses: 'Dog', 'Cat', 'Cow' implement it.
- Store them in an array of 'Animal[]' and call 'makeSound' -> each animal has its own implementation.
 */

// What is default method?

// How could abstract enables polymorphism?
abstract class Animal {

    abstract void makeSound();

}