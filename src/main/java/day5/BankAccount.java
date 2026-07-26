package day5;

public class BankAccount {

    private  double balance;  //    global

    public BankAccount(double intialbalance) {

        balance = intialbalance;
        if(intialbalance < 0) {
            System.out.println("Initial balance can not be negative");
        }
        balance = intialbalance;
    }

    // hello ahmed

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public double getBalance() {

        System.out.println(" your balance is : "+balance);
        return balance ;
    }


}
