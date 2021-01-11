import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

class BinaryTree {
    private Node root;
    private boolean isFound;

    public BinaryTree(int [] array) {
        Node [] nodeArray = new Node[array.length];
        for (int i = 0; i < array.length; i++) {
            nodeArray[i] = new Node(array[i], null, null);
        }

        for (int i = 0; i < array.length; i++) {
            int left = i * 2 + 1;
            int right = i * 2 + 2;

            if (left < array.length) {
                nodeArray[i].left = nodeArray[left];
            }
            if (right < array.length) {
                nodeArray[i].right = nodeArray[right];
            }
        }
        root = nodeArray[0];
    }

    public void preorder() {
        preorderHelper(root);
        System.out.println("");
    }

    private void preorderHelper(Node node) {
        System.out.print(node.value + " ");

        if (node.left != null) {
            preorderHelper(node.left);
        }
        if (node.right != null) {
            preorderHelper(node.right);
        }
    }

    public void inorder() {
        inorderHelper(root);
        System.out.println("");
    }

    private void inorderHelper(Node node) {
        if (node.left != null) {
            inorderHelper(node.left);
        }

        System.out.print(node.value + " ");

        if (node.right != null) {
            inorderHelper(node.right);
        }
    }

    public void postorder() {
        postorderHelper(root);
        System.out.println("");
    }

    private void postorderHelper(Node node) {
        if (node.left != null) {
            postorderHelper(node.left);
        }

        if (node.right != null) {
            postorderHelper(node.right);
        }

        System.out.print(node.value + " ");
    }

    public boolean bfs(int value) {
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        while (!nodeQueue.isEmpty()) {
            Node node = nodeQueue.poll();

            if (node.value == value) {
                return true;
            }

            if (node.left != null) {
                nodeQueue.add(node.left);
            }
            if (node.right != null) {
                nodeQueue.add(node.right);
            }
        }

        return false;
    }

    public boolean dfs(int value) {
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(root);

        while (!nodeStack.isEmpty()) {
            Node node = nodeStack.pop();

            if (node.value == value) {
                return true;
            }

            if (node.right != null) {
                nodeStack.push(node.right);
            }

            if (node.left != null) {
                nodeStack.push(node.left);
            }
        }

        return false;
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