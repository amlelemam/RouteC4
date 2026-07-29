package oopProject.schoolManagementSystem;

public class Teacher extends Person{

    private String subject;


    public Teacher(String firstName, String lastName, String job, String id, char gender, String phoneNumber, String email) {
        super(firstName, lastName, job, id, gender, phoneNumber, email);
    }
}
