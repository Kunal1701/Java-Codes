package Queue;

public class ByLL {
    static class node{
        int data;
        node next;
        node(int s){
            data = s;
        }
    }
    static class Queue{
        static node head = null;
        static node tail = null;
        public static boolean isEmpty(){
            return tail==null && head==null;
        }
        public static void add(int x){
            node newnode = new node(x);
            if(head==null){
                head = tail = newnode;
                return ; 
            }
            tail.next = newnode;
            tail = newnode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int item = head.data;
            if(tail==head){
                tail = head = null;
            }
            else{
                head = head.next;
            }
            return item;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
