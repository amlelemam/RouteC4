package day4;

public class Main {
    void main(String[] args) {

       Sum s = new Sum();
       s.sum2Number(10,20);
       s.sum2Number(10,40);

       hamda();
       total(10,20);
    }

    public static void hamda()
    {
        System.out.println("Hello, Hamda");
    }

    public  void total(int x,int y) {

        int sum = x + y;

        System.out.println("The total is " + sum);
    }

}
