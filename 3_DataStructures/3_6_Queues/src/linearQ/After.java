class LinearQueue {
    private int capacity;
    private int front;
    private int rear;
    private int[] array;

    public LinearQueue(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.rear = 0;
        this.array = new int[capacity];
    }

    public boolean put(int value) {
        if (this.rear == this.capacity) {
            System.out.println("queue overflow");
            return false;
        }
        
        this.array[this.rear++] = value;
        return true;
    }

    public int get() {
        if (this.front == this.rear) {
            System.out.println("queue underflow");
            return -1;
        }
        return this.array[this.front++];
    }

    public int peek() {
        if (this.front == this.rear) {
            return -1;
        }
        return this.array[this.front];
    }

    public String toString() {
        String s = "";
        for (int i = this.front; i < this.rear; i++) {
            s += this.array[i] + " ";
        }
        return s;
    }
}

class LinearQueueTest {
    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(5);
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