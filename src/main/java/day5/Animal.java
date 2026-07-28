package day5;

abstract class Animal
{
    abstract void makeSound();
}
    class Dog extends Animal
    {
        /*
         - **Same method name** , **same parameters** , but in **different classes** (parent -> child).
            - Must involve **inheritance**.
            - Return type must be same (or covariant)
            - Resolved at **runtime**
         */

        @Override //This tells Javav we will override a method from the parent class
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
