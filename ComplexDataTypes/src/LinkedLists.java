import java.util.LinkedList;

public class LinkedLists {

    static class Node{
        int mark;
        Node next;

        Node(int aMark){
            mark = aMark;
            next = null;
        }

        Node getNext(){
            return next;
        }

        void setNext(Node node){
            next = node;
        }

        Object getData(){
            return mark;
        }
    }


    public void add (int thedata){


    }

    public static void main(String[] args) {
        LinkedLists myList = new LinkedLists();
        myList.add(45);

        System.out.println("test");
    }
}


