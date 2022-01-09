import java.util.Vector;

public class Vectors {

    public static void main(String[] args) {

        Vector<String> Student = new Vector<String>();

        Student.add("test");
        Student.add("test");
        Student.add(0,"JumpingToFirst!");
        Student.add("JumpingToFirst!");
        Student.addElement("cat");

        int index = Student.indexOf("JumpingToFirst!");
        System.out.println("the index of Jumpting to first! is: " +index);

    }

}


