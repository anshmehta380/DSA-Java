import java.util.*;
public class Collection_LL {
    public static void main(String[] args) {
        // Syntax of creating LinkedList using Collection frameWork
        // LinkedList<DataType class name> list_name = new LinkedList<DataType class name>();

        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("list");
        System.out.println(list);
        list.addFirst("this");
        System.out.println(list);
        // By default the add() will add the nodes at the end of the linked list
        list.add("by anshMehta");
        System.out.println(list);

        // Printing size
        System.out.println(list.size());

        // Using iteration
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("NULL");

        // Deletion is done with the help of remove function
        // Suppose you want to delete at particular index then you can do it by passing the index directly
        list.remove(0);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
