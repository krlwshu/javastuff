import java.io.*;


public class FileHandlers {
    public static void main(String[] args) throws IOException {


        // Example write to file by function
        writeToFile("out.txt","Hello world!");
        writeToFile("out.txt","Does it append..or overwrite?");

        // Example read from file - use try catch to make handle missing file exception
        printFromFile("out.txt");

        // Read from CSV
        String[][] csv = readCsvFile("biostats.csv");

        System.out.println("Finished!");

    }

    public static String[][] readCsvFile(String fileName){
        String[][] res;

        int colCount = 0;
        int rowCount = 0;

        //Set up placeholder for CSV values - get the col and row counts
        try(BufferedReader fr = new BufferedReader(new FileReader(fileName))){

            String line = fr.readLine();
            String[] cols;

            while(line != null){
                ++rowCount;
                cols = line.split(",");
                colCount = cols.length;
                line = fr.readLine();
            }
        } catch(Exception e){
            System.out.println("Errror reading file");

        }

        // Set up 2d array
        res = new String[rowCount][colCount];

        try(BufferedReader fr = new BufferedReader(new FileReader(fileName))){

            String line = fr.readLine();

            int i = 0; int j;

            // Use as main loop to read each line of file
            while(line != null){
                String[] data = line.split(",");

                //Loop through current column
                for(j=0; j<data.length; j++){
                    res[i][j] = data[j];
                }
                // Read next line and increment row (i)
                line = fr.readLine();
                ++i;

            }
        } catch(Exception e){
            System.out.println("Errror reading file");

        }


        return res;
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
