package day2;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        // Scanner => allow take inputs from external source
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter your age, please: ");
//
//        int personAge = input.nextInt();
//
//       // System.out.println("Your age is : "+personAge);
//        String  status = personAge  >= 18 ? "Good to vote " : "Not good to vote ";
//        System.out.println("Your age is : " + status);
//
//        if (personAge >= 18){
//            System.out.println("Good to vote ");
//        }else {
//            System.out.println("Not good to vote");
//        }

        System.out.println("Enter a number to decide even or odd");
        int number = input.nextInt();
        if (number >= 0) {
            if (number == 0) {
                System.out.println("The number is Zero");
            } else if (number % 2 == 0) {
                System.out.println("The number " + number + " is even");
            } else {
                System.out.println("The number " + number + " is odd");
            }

        } else
            System.out.println("Negative number is not allowed");
    }
}