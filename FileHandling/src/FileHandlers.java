import java.io.*;


public class FileHandlers {
    public static void main(String[] args) throws IOException {


        // Example write to file by function
        writeToFile("out.txt","Hello world!");
        writeToFile("out.txt","Does it append..or overwrite?");

        // Example read from file - use try catch to make handle missing file exception
        printFromFile("out.txt");
    }

    public static void writeToFile(String file, String message){

        try {
            FileWriter fw = new FileWriter(file,true); //setting the second parameter to true for append, omit or false to overwrite
            BufferedWriter bw = new BufferedWriter (fw);
            bw.append(message);
            bw.newLine();
            bw.close();
            fw.close();

        }
        catch(Exception e) {
            System.err.print("Error");
        }

        return;
    }


    public static void printFromFile(String file){
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                System.out.println("FROM READER:" + line);
            }
        } catch (Exception FileNotFoundException){
            System.out.println("The file could not be found");
        }

    }


}
