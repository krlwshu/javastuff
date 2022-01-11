import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;


public class ArrayListApp {

    public static void main(String[] args) {

        //Example arrayList app which takes user input and appends, removes from and edits an arrayList

        //User input the fruit names to arrayList
        ArrayList<String> fruitNames = new ArrayList<>();
        Scanner in=new Scanner(System.in);

        String[] sampleFruits = {"apple", "mango","papaya","guava","orange"};
        for(int i = 1; i <=5; i++){
            System.out.println("Please enter name of fruit:");
//            fruitNames.add(in.next());
            fruitNames.add(sampleFruits[i-1]);
        }

        //User input name of fruit to be removed, for simplicity we'll assume Scanner instance receives valid text
        System.out.println("Enter name to remove:");
        removeFruit(fruitNames,in.next());


        //Edit fruit
        System.out.println("Enter fruit to edit:");
        String oldFruit = in.next();
        System.out.println("Enter new fruit name");
        String newFruit = in.next();
        updateFruit(fruitNames,oldFruit,newFruit);



        //Set up iterator and print all fruits
        Iterator<String> fruitIterator = fruitNames.iterator();
        while(fruitIterator.hasNext()){
            String currentFruit = fruitIterator.next();
            System.out.println(currentFruit);
        }




    }

    private static void removeFruit(ArrayList al, String fruit){
        al.remove(fruit);
    }

    private static void updateFruit(ArrayList al, String oldName, String NewName){
        if(al.contains(oldName)){
            int index = al.indexOf(oldName);
            al.set(index,NewName);
        }
    }



}
