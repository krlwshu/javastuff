import java.util.Scanner;

public class Factorial {

    public static void main(String args[]){

        Scanner in=new Scanner(System.in);

        System.out.println("Enter a whole number");
        int number = in.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of "+number+" is: "+ result );

    }

    private static int factorial(int value) {


        if (value == 1)
            return 1;

        return value * factorial(value - 1);

    }

}
