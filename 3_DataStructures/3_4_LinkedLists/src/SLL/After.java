class Node {
    public int value;
    public Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
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
        this.head = new Node(value, this.head);
        return true;
    }

    public boolean append(int value) {
        Node curr = this.head;
        Node prev = null;

        if (curr == null) {
            this.head = new Node(value, null);
            return false;
        }
        
        while(curr != null) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = new Node(value, null);
        return true;
    }

    public boolean setHead(int index) {
        Node curr = this.head;

        for(int i = 0; i < index; i++) {
            if (curr == null) {
                return false;
            }
            curr = curr.next;
        }

        this.head = curr;
        return true;
    }

    public int access(int index) {
        Node curr = this.head;

        for(int i = 0; i < index; i++) {
            if (curr == null) {
                return -1;
            }
            curr = curr.next;
        }

        return curr.value;
    }

    public boolean insert(int index, int  value) {
        if (index == 0) {
            this.prepend(value);
            return true;
        }

        Node curr = this.head;
        Node prev = null;
        
        for(int i = 0; i < index; i++) {
            if (curr == null) {
                return false;
            }
            prev = curr;
            curr = curr.next;
        }

        prev.next = new Node(value, curr);
        return true;
    }

    public boolean remove(int index) {
        if (index == 0) {
            if (this.head != null) {
                this.head = this.head.next;
                return true;
            }
            else {
                return false;
            }
        }

        Node curr = this.head;
        Node prev = null;

        for(int i = 0; i < index; i++) {
            if (curr == null) {
                return false;
            }
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;
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
}


class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        System.out.println(myList);

        for (int i = 0; i < 10; i++) {
            myList.append(i + 1);
        }
        System.out.println(myList);

        for (int i = 0; i < 10; i++) {
            myList.prepend(i + 1);
        }
        System.out.println(myList);

        int value = myList.access(3);
        System.out.println("myList.access(3) = " + value);

        myList.insert(8, 128);
        System.out.println(myList);

        myList.remove(4);
        System.out.println(myList);

        myList.setHead(10);
        System.out.println(myList);
    }
}
