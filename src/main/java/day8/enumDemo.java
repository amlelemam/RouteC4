package day8;

public class enumDemo {
    public static void main(String[] args) {
        //print an Enum
        System.out.println(Mobile.Motorola);

        Mobile mobile = Mobile.Samsung;
        //Usage in IF statement
        if (mobile == Mobile.Samsung) {
            System.out.println("Matched");
        }

        //Usage in Switch statement
        switch (mobile) {
            case Samsung:
                System.out.println("Samsung");
                break;
            case Nokia:
                System.out.println("Nokia");
                break;
            case Motorola:
                System.out.println("Motorola");
        }
    }
}