import java.util.ArrayList;
import java.util.Stack;

public class Q_reverse_the_stack
{

    public static void main(String[] args)
    {

        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Before: ");
        while(!(st.isEmpty()))
        {
            System.out.println(st.peek());
            st.pop();
        }
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        while(!(st.isEmpty()))
        {
            list.add(st.peek());
            st.pop();
        }
        for(int i=0;i<list.size();i++)
        {
            st.push(list.get(i));
        }
        System.out.println();
        System.out.println("After");
        while(!(st.isEmpty()))
        {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
