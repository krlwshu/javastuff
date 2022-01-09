import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>(); // Create an ArrayList object

        students.add("Joe Blogs");
        students.add("Jane Doe");
        students.add("Jack Black");
        students.add("Zack Goldbloom");
        students.add("John Toogood");
        students.add("Elon Rusk");

        System.out.println("There are "+students.size()+ " students");

        // Using an iterator
        Iterator<String> studentIterator = students.iterator();
        while(studentIterator.hasNext()){
            String Student = studentIterator.next();
            System.out.println("First Name: " + Student.split(" ")[0]);
        }



        //Modify arrayList behaviour
        System.out.println("Attempting to remove Jane! Standby...");
        if(removeItem(students, "Jane Doe"))
            System.out.println("There are now "+students.size()+ " students");

        // Clear all
        students.clear();


        //Check if all gone
        if(students.size() == 0 )
            System.out.println("There are no students left");

    }

    // Array list is passed to the function by reference / pointer to location in memory
    public static boolean removeItem(ArrayList student, String item){
        return student.remove(item);
    }

}
