public class CircularQueue_using_array
{
    static class cqueue {
        static int front = -1;
        static int rear = -1;
        static int size;
        static int[] queue;
        cqueue(int n){
            size = n;
            queue = new int[n];
        }

        public static boolean isEmpty(){
            return front == -1 && rear == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        //Enqueue (Add)
        public static void add(int data){
            if(isFull())
            {
                System.out.println("Queue is full!");
                return;
            }
            // setting front pointer if adding the first node
            if(front == -1)
            {
                front = 0;
            }
            rear = (rear+1)%size;
            queue[rear] = data;
        }

        // Dequeue (Delete)
        public static int remove()
        {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = queue[front];
            // deleting a single element
            if(rear==front)
            {
                front = rear = -1;
            }
            else{
                front = (front+1)%size;
            }
            return result;
        }

        // Peek
        public static int peek(){
            if(isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return queue[front];
        }
    }
    public static void main(String[] args) {
        cqueue cq = new cqueue(5);
        cqueue.add(1);
        cqueue.add(2);
        cqueue.add(3);
        cqueue.add(4);
        cqueue.add(5);
        cqueue.remove();
        cqueue.add(1);
        System.out.println("Queue is: ");
       while(!(cqueue.isEmpty()))
       {
           System.out.print(cqueue.peek()+" ");
           cqueue.remove();
       }
    }
}
