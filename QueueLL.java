class QueueLL {

    static class Node {
        int data;   Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        //  isEmpty function
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        //  push in queue
        public void push(int data) {
            Node newNode = new Node(data);
            if(isEmpty()) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        //  pop in queue
        public int pop() {
            if(isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int front = head.data;
            if(head == tail)
                tail = null;
            
            head = head.next;
            return front;
        }

        // peek in queue
        public int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue qq = new Queue();
        qq.push(10);
        qq.push(20);
        qq.push(30);
        qq.push(40);
        qq.push(50);

        while(!qq.isEmpty()) {
            System.out.print(qq.peek()+" ");
            qq.pop();
        }
    }
}
