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

    }

    public boolean prepend(int value) {

    }

    public boolean append(int value) {

    }

    public boolean setHead(int index) {

    }

    public int access(int index) {

    }

    public boolean insert(int index, int  value) {

    }

    public boolean remove(int index) {

    }

    public String toString() {

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