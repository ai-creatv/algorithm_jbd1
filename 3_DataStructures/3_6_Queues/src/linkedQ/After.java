class Node{
    public int value;
    public Node next;
    public Node prev;

    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
    
class LinkedQueue{
    private Node head;
    private Node tail;

    public LinkedQueue() {
        head = null;
        tail = null;
    }

    public boolean put(int value) {
        if (head == null) {
            head = new Node(value, null, null);
            tail = head;
            return true;
        }

        Node node = new Node(value, null, tail);
        tail.next = node;
        tail = node;
        return true;
    }

    public int get() {
        if (head == null) {
            return -1;
        }

        int value = head.value;
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return value;
    }

    public int peek() {
        if (head == null) {
            return -1;
        }

        return head.value;
    }

    public String toString() {
        String s = "";
        Node curr = head;

        if (curr == null) {
            return "[]";
        }

        while (curr != null) {
            s += curr.value + " ";
            curr = curr.next;
        }
        return s;
    }
}


class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();
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