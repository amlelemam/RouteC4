package day3;

import java.util.Scanner;

public class EmployeeGrossPay {
    public static void main(String[] args) {

        int HourRate = 15;
        int weeklyWorkingHours = 40;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Weekly Working Hours: ");

        double empWorkingHours = sc.nextDouble();

        while(empWorkingHours > weeklyWorkingHours || empWorkingHours <= 0)
        {
            System.out.println("Invalid entry. Please enter between 1h to 40h");

            System.out.println("Enter your weekly working hours: ");
            empWorkingHours = sc.nextDouble();
//          break; //BUG
        }

        double salary = empWorkingHours * HourRate;
        System.out.println("Your weekly gross salary: " + salary + "$");
    }
}