import java.util.Collections;
import java.util.LinkedList;

public class Collection_LL2
{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.addFirst(1);
        list.add(2,15);
        System.out.println(list);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"->");
        }
        System.out.print("null");
        Collections.reverse(list);
        System.out.println();
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+"->");
        }
        System.out.print("null");
    }
}
