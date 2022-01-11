import java.util.LinkedList;

public class LinkedListApp{
    public class Node{
        int data;
        Node next;
        public Node(int data){this.data = data;}
    }


    Node head;

    public void insert(int data){

        Node node = new Node(data);

        if (head == null){
            head = node;
        } else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }

//        while()

    }

    public void printNodes(){
        Node node = head;
        while(node.next != null){
            System.out.println("Node"+node.data);
            node = node.next;
        }
    }

    public void remove(int index){
        Node temp = head, prev = null;

        //Update head
        if(temp != null && temp.data == index){
            head = temp.next;
            return;
        }

        //Get the previous and next linked list items
        while(temp !=null && temp.data!=index){
            prev = temp;
            temp = temp.next;
        }

        //Key not in LL
        if(temp==null)
            return;

        //Set the previous item's (before the one to be removed) next item to the one ahead, item now removed!
        prev.next = temp.next;
    }

    public int getSize(){

        Node temp = head;
        int counter =0;
        while (temp !=null){
            temp = temp.next;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        LinkedListApp list = new LinkedListApp();
        list.insert(5);
        list.insert(10);
        list.insert(14);
        list.insert(13);
        list.insert(15);

        System.out.println("The original LL size is: " +list.getSize());
        list.printNodes();

        list.remove(10);
        System.out.println("After removing item 5, the new slize is: "+list.getSize());

        list.printNodes();

    }
}

