public class LL {
    Node head;
    class Node {
        String data;
        Node next;
        Node(String d) {
            this.data = d;
            this.next = null;
        }
    }
    // Add Operation - first,last
    public void addFirst(String data) {
        // Creating a node
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // Adding at last
    public void addLast(String data) {
        // Case 1: if head is Null
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }
        // Case 2: if head is not Null
        // Creating a pointer for traversal
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // Adding in Between
    public void addBetween(String data,int idx) {
        Node newNode = new Node(data);
        Node currNode = head;
        Node currNode2 = head.next;
        while(idx>1)
        {
            currNode = currNode.next;
            currNode2 = currNode2.next;
            idx--;
        }
        newNode.next = currNode2;
        currNode.next = newNode;
    }

    // Printing a linkedlist
    public void traverse() {
        if(head == null) {
            System.out.println("List is empty!");
            return;
        }
    Node currNode = head;
        while(currNode!=null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        // In Order to create a list you have to create an object of that class such as
        LL list = new LL();
        list.addFirst("2");
        list.addFirst("1");
        list.addLast("4");
        list.addLast("5");
        list.addBetween("3",2);
        list.traverse();
    }
}
