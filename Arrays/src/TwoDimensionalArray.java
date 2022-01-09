import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        String[][] myArray = {{"Test1","test123"},{"test2345123423","test"},{"Test","Test"}};
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++) {
                System.out.println(myArray[i][j]);
            }
        }

    }
}
