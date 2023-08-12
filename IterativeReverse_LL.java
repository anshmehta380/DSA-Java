public class IterativeReverse_LL
{
    Node head;
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }

    // REVERSING A LINKED LIST USING ITERATION
    public void createLinkedList(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node p = head;
        while(p.next != null)
        {
            p = p.next;
        }
        p.next = newNode;
    }
    public void traverseList()
    {
    Node p = head;
    while(p!=null)
    {
        System.out.print(p.data+"->");
        p=p.next;
    }
        System.out.println("null");
    }
    public void reverseList()
    {
        if(head == null || head.next==null)
        {
            return;
        }
        Node prev = head;
        Node currNode = head.next;
        while(currNode!=null)
        {
            Node nextNode = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prev;
    }
    public static void main(String[] args)
    {
       IterativeReverse_LL list = new IterativeReverse_LL();
       list.createLinkedList("1");
       list.createLinkedList("2");
       list.createLinkedList("3");
       list.createLinkedList("4");
       list.createLinkedList("5");
       list.traverseList();
        list.reverseList();
        list.traverseList();
    }
}
