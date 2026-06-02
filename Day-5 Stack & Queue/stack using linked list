import java.util.Scanner;

public class StackUsingLinkedList {

    class Node {
        int data;
        Node next;
    }

    Node top = null;

    static int size;
    int count = 0;

    Scanner sc = new Scanner(System.in);

    // Push
    public void push() {

        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
            return;
        }

        Node newNode = new Node();

        System.out.print("Enter element to be added: ");
        int data = sc.nextInt();

        newNode.data = data;
        newNode.next = top;
        top = newNode;

        count++;

        System.out.println("Element pushed.");
    }

    // Pop
    public void pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        int data = top.data;
        top = top.next;

        count--;

        System.out.println(data + " popped.");
    }

    // Peek
    public void peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Top element: " + top.data);
    }

    // Is Empty
    public boolean isEmpty() {
        return top == null;
    }

    // Is Full
    public boolean isFull() {
        return count == size;
    }

    public void isEmptyDisplay() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }

    public void isFullDisplay() {
        if (isFull()) {
            System.out.println("Stack is full.");
        } else {
            System.out.println("Stack is not full.");
        }
    }

    // Display
    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Node temp = top;

        System.out.print("Stack: ");

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StackUsingLinkedList obj = new StackUsingLinkedList();

        System.out.print("Enter the size of the stack: ");
        size = sc.nextInt();

        while (true) {

            System.out.println("\n------ TASKS ------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. IsEmpty");
            System.out.println("4. IsFull");
            System.out.println("5. Display");
            System.out.println("6. Peek");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    obj.push();
                    break;

                case 2:
                    obj.pop();
                    break;

                case 3:
                    obj.isEmptyDisplay();
                    break;

                case 4:
                    obj.isFullDisplay();
                    break;

                case 5:
                    obj.display();
                    break;

                case 6:
                    obj.peek();
                    break;

                case 0:
                    System.out.println("Exited.");
                    sc.close();
                    obj.sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
