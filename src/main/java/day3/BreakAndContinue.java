package day3;

public class BreakAndContinue {

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++)
        {
            if(i == 5)
                break;
            System.out.println("Break:" + i);
        }

        System.out.println("____________________________________");

        for(int i = 1; i <= 10; i++)
        {
            if(i == 5)
                continue;
            System.out.println("Continue:" + i);
        }

        for(int i = 1; i <= 10; i--)
        {
            if(i == -5)
                break;
            System.out.println("Break:" + i);
        }

    }

}
