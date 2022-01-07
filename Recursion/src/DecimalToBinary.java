import java.util.Scanner;

public class DecimalToBinary{

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int number = in.nextInt();
        String result = toBinary(number);
        System.out.println("The Binary equivalent for: "+number+" is "+result);
    }

    private static String toBinary(int value){

        if (value == 0){
            return "";
        } else {
            String res = toBinary(value/2);
            return res+(value%2);
        }
    }
}



