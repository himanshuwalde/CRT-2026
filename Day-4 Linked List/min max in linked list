import java.util.*;

public class MinMaxInLinkedList {

    class GetNode {
        int data;
        GetNode next;
    }

    GetNode head = null;
    Scanner sc = new Scanner(System.in);

    // Append node
    public void append() {
        GetNode newNode = new GetNode();

        System.out.print("Enter element to be added: ");
        int data = sc.nextInt();

        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            GetNode ptr = head;

            while (ptr.next != null) {
                ptr = ptr.next;
            }

            ptr.next = newNode;
        }

        System.out.println("Element " + data + " added.");
    }

    // Find minimum
    public void min() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        GetNode ptr = head;
        int min = ptr.data;

        while (ptr != null) {
            if (ptr.data < min) {
                min = ptr.data;
            }
            ptr = ptr.next;
        }

        System.out.println(min + " is minimum.");
    }

    // Find maximum
    public void max() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        GetNode ptr = head;
        int max = ptr.data;

        while (ptr != null) {
            if (ptr.data > max) {
                max = ptr.data;
            }
            ptr = ptr.next;
        }

        System.out.println(max + " is maximum.");
    }

    // Traverse list
    public void traverse() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        GetNode ptr = head;

        System.out.print("List: ");

        while (ptr != null) {
            System.out.print(ptr.data);

            if (ptr.next != null) {
                System.out.print(" -> ");
            }

            ptr = ptr.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MinMaxInLinkedList obj = new MinMaxInLinkedList();

        while (true) {
            System.out.println("\n------ TASKS ------");
            System.out.println("1. Append");
            System.out.println("2. Traverse");
            System.out.println("3. Find Minimum");
            System.out.println("4. Find Maximum");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    obj.append();
                    break;

                case 2:
                    obj.traverse();
                    break;

                case 3:
                    obj.min();
                    break;

                case 4:
                    obj.max();
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
