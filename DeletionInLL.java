public class DeletionInLL {
    Node head;
    private int size;
    DeletionInLL() {
        this.size =0;
    }
    class Node {
        String data;
        Node next;
        Node(String d) {
            this.data = d;
            this.next = null;
            size++;
        }
    }
    // First of all we will create a list
    public void insert(String data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
        }
        else {
            Node currNode = head;
            while(currNode.next!=null)
            {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    // Function to print a linked list
    public void traverse() {
        Node currNode = head;
        while(currNode!=null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // Functions to delete in LinkedList
    public void deleteAtFirst() {
        // Case 1 : in case if head is empty
        if(head == null) {
            System.out.println("List is empty!!");
            return;
        }
        size--;
        head = head.next;
    }

    // Deletion at end
    public void deleteAtEnd() {
        // Case 1 : in case if head is empty
        if(head == null) {
            System.out.println("List is empty!!");
            return;
        }
        // Case 2: if deleting single node
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node currNode2 = head.next;
        while(currNode2.next!=null) {
            currNode = currNode.next;
            currNode2 = currNode2.next;
        }
        currNode.next=null;
    }
    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        DeletionInLL list = new DeletionInLL();
        list.insert("1");
        list.insert("2");
        list.insert("3");
        list.insert("4");
        list.insert("5");
        list.traverse();
        list.deleteAtFirst();
        list.traverse();
        list.deleteAtEnd();
        list.traverse();
        System.out.println("Size of the linked list is: "+list.getSize());
    }
}
