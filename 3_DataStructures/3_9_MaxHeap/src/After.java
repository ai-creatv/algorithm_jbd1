class MaxHeap {
    private int [] array;
    private int length;

    public MaxHeap(int capacity) {
        array = new int[capacity + 1];
        length = 0;
    }

    public void push(int val) {
        array[++length] = val;
        int curr = length;

        while (curr > 1) {
            int parent = curr / 2;
            if (array[curr] > array[parent]) {
                int temp = array[curr];
                array[curr] = array[parent];
                array[parent] = temp;
                curr = parent;
            } else {
                break;
            }
        }
            
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        int val = array[1];
        array[1] = array[length--];
        
        int curr = 1;
        while (curr <= length) {
            int left = curr * 2;
            int right = curr * 2 + 1;

            if (right <= length) {
                if (array[left] < array[right]) {
                    if (array[right] > array[curr]) {
                        int temp = array[right];
                        array[right] = array[curr];
                        array[curr] = temp;
                        curr = right;
                    } else {
                        break;
                    }
                }
            } 

            if (left <= length) {
                if (array[left] > array[curr]) {
                    int temp = array[left];
                    array[left] = array[curr];
                    array[curr] = temp;
                    curr = left;
                } else {
                    break;
                }
            } else {
                break;
            }            
        }

        return val;
    }

    public int peek() {
        return array[1];
    }

    public boolean isEmpty() {
        return length <= 0;
    }
}


class MaxHeapTest {
    public static void main(String[] args) {
        MaxHeap heap = new MaxHeap(10);

        int [] data = {1,6,32,14,60,2,5,66};
        for (int e: data) {
            heap.push(e);
        }

        while (!heap.isEmpty()) {
            System.out.println(heap.pop());
        }
    }
}

