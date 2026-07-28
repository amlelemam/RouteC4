package day4;

import java.util.Scanner;

public class Rectangle {

    //Encapsulation => data hiding, data protection, data security

    // Scanner input = new Scanner(System.in);

    //Data hiding: Prevent direct modification of fields
    //Benefit: Improves security, maintainability, and flexibility

    private double length; // field
    private double width; // field

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width >0)
            this.width = width;
        else
            System.out.println("Please enter a valid width");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length >0)
            this.length = length;
        else
            System.out.println("Please enter a valid length");

    }

    public double calculateArea(){
        return width*length;
    }

//    public double calculateArea() {
//        System.out.println("Enter length of rectangle");
//        length = input.nextDouble();
//        System.out.println("Enter width of rectangle");
//        width = input.nextDouble();
//        double area = length * width;
//        System.out.println("The area of rectangle is " + area);
//        return area;
//    }
}