package oopProject.schoolManagementSystem;

import java.util.Scanner;

public class Student extends Person{

    private int grade;
    private  static Scanner scanner = new Scanner(System.in);

    private static Person readPersonInfo()
    {
        System.out.println("Enter first name of student:");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name of student:");
        String lastName = scanner.nextLine();

        System.out.println("Enter grade of student:");
        String grade = scanner.nextLine();

        System.out.println("Enter job of student:");
        String job = scanner.nextLine();

        System.out.println("Enter id of student:");
        String id = scanner.nextLine();

        System.out.println("Enter email of student:");
        String email = scanner.nextLine();

        System.out.println("Enter phone of student:");
        String phone = scanner.nextLine();

        System.out.println("Enter gender of student M/F:");
        char gender = scanner.next().charAt(0);

        return new Person(firstName, lastName, job, String.valueOf(id), gender, phone, email);
    }

    public Student(int grade)
    {
        this(grade, readPersonInfo());
    }


    private Student(int grade, Person person)
    {
        super(person.getFirstName(),
                person.getLastName(),
                person.getJob(),
                person.getId(),
                person.getGender(),
                person.getPhoneNumber(),
                person.getEmail());
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade)
    {
        if (grade >= 1 && grade <= 100)
        {
            this.grade = grade;
        }
        else
        {
            System.out.println("Grade must be between 1 and 100");
        }
    }

}
