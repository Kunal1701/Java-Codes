package Queue;

public class ByArray {

    static class Queues {
        static int rear;
        static int front;
        static int arr[];
        static int size;

        Queues(int n) {
            size = n;
            arr = new int[n];
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            if ((rear + 1) % size == front)
                return true;
            return false;
        }

        public static void add(int item) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }

            if (front == -1)
                front = 0;
            rear = (rear + 1) % size;
            arr[rear] = item;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int item = arr[front];

            if (rear == front)
                rear = front = -1;
            else
                front = (front + 1) % size;
            return item;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {
        Queues q = new Queues(4);
        q.add(2);
        q.add(1);
        q.add(3);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
