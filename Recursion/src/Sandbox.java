import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = in.nextInt();
        int result = factorial(number);
        System.out.println(result);

    }

    private static int factorial(int value){
        if (value == 1)
            return 1;
        return value * factorial(value -1);

    }

}
