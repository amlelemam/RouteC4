package day5;

abstract class Animal
{
    abstract void makeSound();
}

    class Dog extends Animal
    {
        @Override
        void makeSound() {
            System.out.println(" Dog says: Woof ");
        }
    }

    class Cat extends Animal
    {
        @Override
        void makeSound()
        {
            System.out.println(" Cat says: Meow ");
        }
    }

    class Cow extends Animal
    {
        @Override
        void makeSound()
        {
            System.out.println(" Cow says: Moo ");
        }
    }



