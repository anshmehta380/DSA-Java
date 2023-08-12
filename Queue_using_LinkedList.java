public class Queue_using_LinkedList
{
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
        static Node head;
        public static boolean isEmpty() {
            return head == null;
        }
        public static void insert(int data){
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }
            Node p = head;
            while(p.next != null){
                p = p.next;
            }
            p.next = newNode;
        }
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            if(head.next==null)
            {
                int k =  head.data;
                head = null;
                return k;
            }
           head = head.next;
           return head.data;
        }
        public static void traverse(){
            if(isEmpty())
            {
                System.out.println("Queue is empty!");
                return;
            }
            Node p = head;
            while(p != null){
                System.out.println(p.data+" ");
                p = p.next;
            }
        }
    }
    public static void main(String[] args)
    {
        Node.insert(5);
        Node.insert(4);
        Node.insert(3);
        Node.insert(2);
        Node.insert(1);
        System.out.println("Before Deletion");
        Node.traverse();
        Node.remove();
        System.out.println("After Deletion");
        Node.traverse();
        Node.remove();
        Node.remove();
        Node.remove();
        Node.remove();
        Node.remove();
    }
}
