import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Q_push_at_bottomOf_stack
{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value you wish at bottom: ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        if(st.isEmpty())
        {
            System.out.println("Stack Was Empty so we pushed the element directly");
            st.push(a);
        }
        else
        {
            while(!(st.isEmpty()))
            {
                list.add(st.peek());
                st.pop();
            }
            st.push(a);
            for(int i = list.size()-1;i>=0;i--)
            {
                st.push(list.get(i));
            }
        }
        // Printing Stack
        while(!(st.empty()))
        {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
