package day3;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st number, plz: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter 2nd number, plz: ");
//        int num2 = sc.nextInt();
//        System.out.println("Enter 3rd number, plz: ");
//        int num3 = sc.nextInt();
//        if(num1 == num2 && num1 == num3){
//            System.out.println("All 3 numbers are equal: " + num1);
//        }else if(num1 > num2 && num1 > num3)
//        {
//            System.out.println("1st number " + num1 + " is the greatest number");
//        }else if(num2 > num1 && num2 > num3)
//        {
//            System.out.println("2nd number " + num2 + " is the greatest number");
//        }else
//        {
//            System.out.println("3rd number " + num3 + " is the greatest number");
//        }
//    }

//        System.out.println("Enter the number");
//        int daynum = sc.nextInt();
//        if (daynum == 1)
//            System.out.println("Monday");
//        else if (daynum == 2)
//           System.out.println("Tuesday");
//        else if (daynum == 3)
//           System.out.println("Wednesday");
//        else if (daynum == 4)
//           System.out.println("Friday");
//        else if (daynum == 6)
//           System.out.println("Saturday");
//        else if (daynum == 7)
//           System.out.println("Sunday");
//        else
//           System.out.println("Invalid day number. Please enter a number from 1 to 7");

        //Switch Case
        System.out.println("Enter the name");
        String dayname = sc.nextLine();
        switch (dayname) {
            case "Monday":
                System.out.println("1");
                break;
            case "Tuesday":
                System.out.println("2");
                break;
            case"Wednesday":
                System.out.println("3");
                break;
            case "Thursday":
                System.out.println("4");
                break;
            case "Friday":
                System.out.println("5");
                break;
            case "Saturday":
                System.out.println("6");
                break;
            case "Sunday":
                System.out.println("7");
                break;
            default:
                System.out.println("Invalid input. Please enter a valid day name");
        }
    }
}

