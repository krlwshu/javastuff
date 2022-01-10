//Recursive function to calculate Fibonacci sequence based on a user defined range
import java.util.Scanner;
public class Fibonacci{

    public static int calcFibonnaci(int myNumber){
        if(myNumber == 0){
            return 0;
        }
        if(myNumber == 1 || myNumber == 2){
            return 1;
        }
        return calcFibonnaci(myNumber-2) + calcFibonnaci(myNumber-1);
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter whole number: ");
        int theNumber = in.nextInt();
        System.out.print("Fibonacci Series of "+theNumber+" numbers is: ");
        for(int i = 0; i < theNumber; i++){
            System.out.print(calcFibonnaci(i) +" ");
        }
    }
}

