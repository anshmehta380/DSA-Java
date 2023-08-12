import java.util.*;

public class Queue_using_Collection_FrameWork
{
    public static void main(String[] args)
    {
        /* Why Linked List Why not "new Queue?".
           Because in Collection framework queue is an interface and you can only create objects of a class
           So you'll have to implement queue Using LinkedList or ArrayDequeue.
         */
        Queue<Integer> ql = new LinkedList<>();
        Queue<Integer> qd = new ArrayDeque<>();
        ql.add(1);
        ql.add(2);
        ql.add(3);
        ql.add(4);
        ql.add(5);
        while(!(ql.isEmpty()))
        {
            System.out.print(ql.peek()+" ");
            ql.remove();
        }
    }
}
