import java.util.Scanner;

public class Account {
    Scanner in=new Scanner(System.in);
    private String customerName;
    private String accNumber;
    private String accType;
    private int PIN;
    private float deposit;
    private float balance=0;


    public Account(String theCustName, String accountNumber, String type, int thePin, float theDeposit){
        customerName = theCustName;
        accNumber = accountNumber;
        accType=type;
        PIN = thePin;
        deposit = theDeposit;
        this.balance = balance+deposit;
    }

    public float getBalance(){
        return balance;
    }

    public float getDeposit(){
        return deposit;
    }

    public String getAccNumber(){
        return accNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAccType(){
        return accType;
    }

    public int setPIN(int oldPIN) {
        int count = 1;
        int newPIN;
        System.out.print("Please enter Old Pin: ");
        oldPIN = in.nextInt();
        while (PIN != oldPIN && count < 3) {
            System.out.print("Incorrect PIN. Please try again: ");
            newPIN = in.nextInt();
            count++;
        }
        if (count == 3) {
            System.out.println("Your PIN could not be updated at this point");

            return PIN;
        } else {
            System.out.print("Enter New PIN: ");
            newPIN = in.nextInt();
            this.PIN = newPIN;
            System.out.println("Your PIN has been successfully updated");
        }
        return PIN;
    }

    public float withdrawCash(){

        System.out.print("Please enter PIN: ");
        int pin=in.nextInt();
        if(pin==PIN){
            System.out.print("Please amount to withdraw: ");
            float amount=in.nextInt();
            if (amount>balance){
                System.out.println("Insufficient funds. You cannot make a withdrawal at this point");

            }
            else{
                balance = balance - amount;
            }

        }
        else{
            System.out.println("Incorrect PIN");
        }
        return balance;
    }

    public void printStatement(){
        System.out.println("Customer Name: "+ getCustomerName());
        System.out.println("Account Number: " + getAccNumber());
        System.out.println("Balance: "+ "£" + getBalance());

    }

    public String toString(){
        return getCustomerName() +","+getAccNumber()+",£"+getBalance();
    }

}
