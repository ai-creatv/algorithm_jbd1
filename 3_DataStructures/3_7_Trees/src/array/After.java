class BinaryTree {
    private int [] array;
    private boolean isFound;

    public BinaryTree(int [] array) {
        this.array = array;
    }

    public void preorder() {
        preorderHelper(0);
        System.out.println("");
    }

    private void preorderHelper(int index) {
        System.out.print(array[index] + " ");

        int left = index * 2 + 1;
        int right = index * 2 + 2;
        if (left < array.length) {
            preorderHelper(left);
        }
        if (right < array.length) {
            preorderHelper(right);
        }
    }

    public void inorder() {
        inorderHelper(0);
        System.out.println("");
    }

    private void inorderHelper(int index) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        if (left < array.length) {
            inorderHelper(left);
        }

        System.out.print(array[index] + " ");

        if (right < array.length) {
            inorderHelper(right);
        }
    }

    public void postorder() {
        postorderHelper(0);
        System.out.println("");
    }

    private void postorderHelper(int index) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        if (left < array.length) {
            postorderHelper(left);
        }
        if (right < array.length) {
            postorderHelper(right);
        }
        System.out.print(array[index] + " ");
    }

    public boolean bfs(int value) {
        for (int elem : array) {
            if (elem == value) {
                return true;
            }
        }
        return false;
    }

    public boolean dfs(int value) {
        isFound = false;
        dfsHelper(0, value);
        return isFound;
    }

    private void dfsHelper(int index, int value) {
        if (isFound) {
            return;
        }

        if (array[index] == value) {
            isFound = true;
            return;
        }

        int left = index * 2 + 1;
        int right = index * 2 + 2;
        if (left < array.length) {
            dfsHelper(left, value);
        }

        if (right < array.length) {
            dfsHelper(right, value);
        }
    }
}


class BinaryTreeTest {
    public static void main(String[] args) {
        int [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinaryTree tree = new BinaryTree(array);

        tree.preorder();
        tree.inorder();
        tree.postorder();

        System.out.println(tree.bfs(2));
        System.out.println(tree.bfs(10));

        System.out.println(tree.dfs(5));
        System.out.println(tree.dfs(14));
    }
}