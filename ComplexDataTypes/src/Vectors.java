import java.util.Vector;

public class Vectors {

    public static void main(String[] args) {

        Vector<String> Student = new Vector<>();

        Student.add("Test");
        Student.add("Test123");
        Student.add(0,"FirstPlace!");
        Student.add("FirstPlace!");
        Student.addElement("cat");

        //FirstPlace! is in index positions 0 and 3 but the above indexOf seems to only find the first instance
        int index = Student.indexOf("JumpingToFirst!");
        System.out.println("the index of FirstPlace! is: " +index);

        // The vector keeps tack of the position of the last element
        System.out.println(Student.lastElement());

    }

}


