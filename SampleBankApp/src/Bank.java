import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class Bank {

    public static void main(String[] args){

        Current mRodri = new Current("Maria Rodriguez", "12345678", "Current Account", 1234, 7900, 45, 120);
        Current cRob = new Current("Charles Robertson", "12345000", "Current Account", 1234, 221, 45, 120);
        Premiere sMatt = new Premiere("Samantha Matthews", "87654321", "Premiere Account", 1234, 655, 5000, .035F);
        Premiere aMah = new Premiere("Ahmed Mahmood", "8765555", "Premiere Account", 1234, 907, 5000, .035F);

//        System.out.println(mRodri.toString());
//        System.out.println(aMah.toString());

        Vector<Account> bankDetails = new Vector<>();
        bankDetails.add(mRodri);
        bankDetails.add(cRob);
        bankDetails.add(sMatt);
        bankDetails.add(aMah);

        printElements(bankDetails);
        System.out.println("Adding to vector...");
        System.out.print("Writing Vector to CSV");
        System.out.println("Status:"+printToCsv(bankDetails));

        readFromCSV();
    }


    private static void printElements(Vector<Account> data){
        System.out.println("Bank account details:");
        Enumeration en = data.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }

    private static void readFromCSV(){

        try(BufferedReader br = new BufferedReader(new FileReader("accountData.csv"))){
            int counter = 0;

            String[] data;
            String line = br.readLine();
            while(line!=null){
                ++counter;
                data = line.split(",");
                line = br.readLine();
                System.out.printf("%d\t- %s - %s\n",counter,data[0], data[2]);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static boolean printToCsv(Vector<Account> data){

        boolean written = false;
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("accountData.csv",true))){
            String details;
            for (int i = 0; i < data.size(); i++) {
                details=data.get(i).toString();
                bw.write(details + "\n");
                written = true;
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        return written;
    }

}