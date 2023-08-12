// Stack using Linked List
public class stack_using_linkedlist {
    static class node
    {
        int data;
        node next;
        public node(int val){
            data = val;
            next = null;
        }
    }
    static class stack {
        public static node head;
        public static boolean isEmpty()
        {
            return head==null;
        }
        // Push function
        public static void push(int data)
        {
            node newNode = new node(data);
            if(isEmpty())
            {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop()
        {
            if(isEmpty()) return -1;
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek()
        {
            if(isEmpty()) return -1;
            return head.data;
        }
    }
    public static void main(String[] args)
    {
       stack s = new stack();
       s.push(50);
       System.out.println(s.peek());
       s.push(40);
        System.out.println(s.peek());
       s.push(30);
        System.out.println(s.peek());
       s.push(20);
        System.out.println(s.peek());
       s.push(10);
        System.out.println(s.peek());
        s.pop();
        System.out.println();
        System.out.println("After Poping");
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        s.pop();
        System.out.println("The value -1 is returned due to stack becomes empty"+s.peek());
    }
}
