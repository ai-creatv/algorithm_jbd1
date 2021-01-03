class Node {
    public int value;
    public Node next;
    public Node prev;

    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean prepend(int value) {
        if (this.head == null) {
            this.head = new Node(value, null, null);
            this.tail = this.head;
        } else {
            Node node = new Node(value, this.head, null);
            this.head.prev = node;
            this.head = node;
        }

        return true;
    }

    public boolean append(int value) {
        if (this.head == null) {
            this.head = new Node(value, null, null);
            this.tail = this.head;
        } else {
            Node node = new Node(value, null, this.tail);
            this.tail.next = node;
            this.tail = node;
        }

        return true;
    }

    public boolean setHead(int index) {
        Node curr = this.head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
            if (curr == null) {
                return false;
            }
        }
        curr.prev = null;
        this.head = curr;
        return true;
    }

    public int access(int index) {
        Node curr = this.head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
            if (curr == null) {
                return -1;
            }
        }
        return curr.value;
    }

    public boolean insert(int index, int  value) {
        if (this.head == null && index > 0) {
            return false;
        }

        if (index == 0) {
            this.prepend(value);
            return true;
        }

        Node curr = this.head;
        for (int i = 0; i < index; i++) {
            if (curr == null) {
                return false;
            }
            curr = curr.next;
        }

        if (curr == null) {
            this.append(value);
            return true;
        }

        Node node = new Node(value, curr, curr.prev);
        curr.prev.next = node;
        curr.prev = node;
        curr = node;
        return true;
    }

    public boolean remove(int index) {
        if (this.head == null) {
            return false;
        }

        if (index == 0) {
            this.head = this.head.next;
            if (this.head != null) {
                this.head.prev = null;
            }
            return true;
        }

        Node curr = this.head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
            if (curr == null) {
                return false;
            }
        }
        curr.prev.next = curr.next;

        if (curr != this.tail) {
            curr.next.prev = curr.prev;
        } else {
            this.tail = curr.prev;
        }
        return true;
    }

    public String toString() {
        Node curr = this.head;

        if (curr == null) {
            return "[]";
        }

        String s = "";
        while(curr != null) {
            s += curr.value + " ";
            curr = curr.next;
        }
        return s;
    }

    public String toStringInv() {
        Node curr = this.tail;

        if (curr == null) {
            return "[]";
        }

        String s = "";
        while(curr != null) {
            s += curr.value + " ";
            curr = curr.prev;
        }
        return s;
    }
}


class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        System.out.println(myList);
        System.out.println(myList.toStringInv());

        for (int i = 0; i < 10; i++) {
            myList.append(i + 1);
        }
        System.out.println(myList);
        System.out.println(myList.toStringInv());

        for (int i = 0; i < 10; i++) {
            myList.prepend(i + 1);
        }
        System.out.println(myList);
        System.out.println(myList.toStringInv());

        int value = myList.access(3);
        System.out.println("myList.access(3) = " + value);

        myList.insert(8, 128);
        System.out.println(myList);
        System.out.println(myList.toStringInv());

        myList.remove(4);
        System.out.println(myList);
        System.out.println(myList.toStringInv());

        myList.setHead(10);
        System.out.println(myList);
        System.out.println(myList.toStringInv());
    }
}

