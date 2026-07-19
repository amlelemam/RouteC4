package day1;

public class FristJavaProgram {
    public static void main(String[] args) {
        System.out.println("Hello big boy!");


        /*
           System.out.println("Hello big boy!");
        */

        //DataTypes

        // Declaration for variables
        // DataType variableName = value ; -> Initialization


//        String firstName = "Aml";  //Store text into variable -> String can contain letters, numbers, and special characters in " "
//        String x = "2 + 2";
//        System.out.println(x);
//
//        String X = "10";
//        String y = "15";
//        System.out.println(X+y); //1015 -> concatenation -> combining two strings together


        //Numbers

        //1- int

//        int x = 100;
//        int y = 200;
//
//        System.out.println(x + y);
//      //System.out.println("Sum of x and y is: " + (x + y));
//        System.out.println("Sum of x and y is: ");
//        System.out.println(x + y);

        //2- Float
//        float f = 12.09f;
//        System.out.println(f);

        //3- Double

        double d = 55;  //55.0

        double l = 55.33;  //55.33
        System.out.println(d);
        System.out.println(l);


        String firstName = "Aml";
        String lastName = "Elemam";

        String fullName = firstName + " " + lastName; //Concatenation
        int age = 19;
        String datOfBirth = "20/05/2002";
        String job = "Testing Engineer";
        double income = 10.5;
        double tax = income * 0.15;
        double netSalary = income -tax;

        // print
        System.out.println("Hello my name is: " +fullName+
                "\nmy age is: " +age+
                "\nmy job is: :" +job+
                "\nmy income is: " +netSalary);

        System.out.println("________________________________");

        System.out.printf("Hello my full name is: %s%n" + "my age is: %d%n" + "my job is: %s%n" + "my income is: %f%n",
                fullName, age, job, netSalary);

    }
}