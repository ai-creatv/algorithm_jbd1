class Stack {
    private int capacity;
    private int top;
    private int[] array;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.top = 0;
        this.array = new int[capacity];
    }

    public boolean push(int value) {
        
    }

    public int pop() {
        
    }

    public int peek() {

    }

    public boolean isEmpty() {

    }
}

class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println((stack.pop()));
        System.out.println((stack.pop()));

        System.out.println((stack.peek()));

        System.out.println((stack.pop()));
        System.out.println((stack.pop()));
        System.out.println((stack.pop()));
    }
}