class CircularQueue {
    private int capacity;
    private int front;
    private int rear;
    private int[] array;
    private boolean isFull;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.rear = 0;
        this.array = new int[capacity];
        this.isFull = false;
    }

    public boolean put(int value) {
        
    }

    public int get() {
        
    }

    public int peek() {
        
    }

    public String toString() {

    }
}

class CircularQueueTest {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        System.out.println(queue);

        queue.put(1);
        queue.put(2);
        queue.put(3);
        System.out.println(queue);

        System.out.println((queue.get()));
        System.out.println((queue.get()));
        System.out.println((queue.get()));
        System.out.println((queue.get()));
        System.out.println(queue);

        queue.put(4);
        queue.put(5);
        queue.put(6);
        System.out.println(queue);

        System.out.println((queue.get()));
        System.out.println((queue.get()));
        System.out.println((queue.peek()));
        System.out.println((queue.peek()));
        System.out.println((queue.get()));
        System.out.println(queue);
    }
}