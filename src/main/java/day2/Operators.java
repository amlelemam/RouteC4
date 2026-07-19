package day2;

import java.sql.SQLOutput;

public class Operators {

    public static void main(String[] args) {
//        int x = 20;
//        int y = 20;
//        System.out.println(x==y); //true
//        System.out.println(x=y); //x=20
//        System.out.println("x= "+x);
//        System.out.println(x!=y); //false

//        double a = 15.0;
//        int b = 15;
//
//        System.out.println(a==b); //true
//        System.out.println(a!=b); //false

//        int a =25;
//        System.out.println(" The value of a = "+a); //25
//        int b =25;
//        System.out.println("The sum of a and b = "+(a+b)); //50
//
//        a=a+5; //30
//        a+=5;  // shorthand assignment -> a = a + 5 = 35
//        System.out.println(a); //35
//
//        a =a -5;
//        a-=5;
//        System.out.println("The sub of a -5 ="+a);
//
//        a=a*5;
//        a*=5;
//        System.out.println("the multi of a * 5 = "+a);
//
//        a=a /5;
//        a/=5;
//        System.out.println("The div of a / 5 = "+a);
//
//        //System.out.println( "The div of a is  %d%n "+ a);
//        System.out.printf("The div of a is : %d%n" ,a/5);

//       int x =20;
//       int y =3;
//       System.out.println(x%y);
//       if (x%y==0){
//           System.out.println("It is even ");
//       }else {
//           System.out.println("It is odd ");
//       }

//        int a = 7;
//        int b = 5;
//        int c = 7;
//        int d = 7;
//        System.out.println(a>b); //T
//        System.out.println(a<b); //F
//        System.out.println(a==b); //F
//        System.out.println(a>=b); //T
//        System.out.println(a<=b); //F

//        boolean v1 = true;
//        boolean v2 = false;
//
//        System.out.println(v1 && v2);  //AND -> F
//        System.out.println(v1 || v2);  //OR -> T
//
//        System.out.println(a > b && b < c);  //T
//                         //  T        T
//        System.out.println(a > b && b > c);  //F
//                         //  T        F
//        System.out.println(a < b || d > a);  //F
//                         //  F        F
//        System.out.println(a <= b || d >= a);  //T
//                         //  F        T
//        int adbi=20;
//        int almi=15;
//        boolean tamioz = false;
//        if(almi >= adbi || tamioz)
//        {
//            System.out.println("ادخل علمي");
//        }else {
//            System.out.println("ادخل أدبي");
//        }

//        int num = 10;
//        System.out.println(num++); //post increment  -> 10 => num + 1 (save in memory)
//        System.out.println(num); // 11
//        System.out.println(++num); //12 pre increment => increase num then display
//
//        int number = 5;
//        System.out.println(number++); //5
//        System.out.println(number); //6
//        System.out.println(++number); //7

        int a = 18,b = 10,c;
        c = (a>b) ? a : b; // if a>b is true then c=a false c=b
        System.out.println("the largest number is " + c);

        //(a>b) ? a : b
        if(a>b)
            c=a;
        else
            c=b;
    }
}