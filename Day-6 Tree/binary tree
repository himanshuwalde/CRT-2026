import java.util.*;

public class BinaryTree {

    class Node {
        Node leftChild;
        int data;
        Node rightChild;

        public Node(int key) {
            data = key;
            leftChild = null;
            rightChild = null;
        }
    }

    Node root;

    public BinaryTree() {
        root = null;
    }

    // Insert into BST
    public Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.leftChild = insert(root.leftChild, key);
        } else if (key > root.data) {
            root.rightChild = insert(root.rightChild, key);
        }

        return root;
    }

    // Inorder Traversal
    private void inorder(Node root) {
        if (root != null) {
            inorder(root.leftChild);
            System.out.print(root.data + " ");
            inorder(root.rightChild);
        }
    }

    public void inorder() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
    }

    // Preorder Traversal
    private void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.leftChild);
            preorder(root.rightChild);
        }
    }

    public void preorder() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();
    }

    // Postorder Traversal
    private void postorder(Node root) {
        if (root != null) {
            postorder(root.leftChild);
            postorder(root.rightChild);
            System.out.print(root.data + " ");
        }
    }

    public void postorder() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        boolean inserted = false;

        while (true) {
            System.out.println("\n===== BINARY SEARCH TREE MENU =====");
            System.out.println("1. Insert Sample Nodes");
            System.out.println("2. Inorder Traversal");
            System.out.println("3. Preorder Traversal");
            System.out.println("4. Postorder Traversal");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();

            switch (ch) {

                case 1:

                    if (inserted) {
                        System.out.println("Nodes already inserted.");
                        break;
                    }

                    int arr[] = {36, 26, 46, 21, 31, 11, 24, 41, 56, 51, 66};

                    for (int value : arr) {
                        tree.root = tree.insert(tree.root, value);
                    }

                    inserted = true;
                    System.out.println("Nodes inserted successfully.");
                    break;

                case 2:
                    tree.inorder();
                    break;

                case 3:
                    tree.preorder();
                    break;

                case 4:
                    tree.postorder();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
