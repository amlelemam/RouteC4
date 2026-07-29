package oopProject.schoolManagementSystem;

public class Person {

    private String firstName;
    private String lastName;
    private String job;
    private String id;
    private char gender;
    private String phoneNumber;
    private String email;

    public Person(String firstName, String lastName, String job, String id, char gender, String phoneNumber, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.id = id;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public String getJob() {
        return job;
    }

}
