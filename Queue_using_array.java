public class Queue_using_array
{
    static class queue{
        static int arr[];
        static int size;
        static int rear = -1;

        queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            // When the rear value will be -1 it means there will be no elements in array so it will return true, that queue is empty
            return rear == -1;
        }

        // Enqueue
        public static void add(int data)
        {
            if(rear == size-1){
                System.out.println("Queue is full!!");
                return;
            }
            else{
                rear++;
                arr[rear] = data;
            }
        }

        // Dequeue - Big O(n)
        public static int remove()
        {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        // peek()
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }
    }
    public static void main(String[] args)
    {
        queue q = new queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while(!(queue.isEmpty()))
        {
            System.out.println("Element is "+queue.peek());
            queue.remove();
        }
    }
}
