import java.util.Scanner;

public class QueueUsingLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node front = null;
    Node rear = null;

    Scanner sc = new Scanner(System.in);

    // Enqueue
    public void enqueue() {
        System.out.print("Enter element: ");
        int data = sc.nextInt();

        Node newNode = new Node(data);

        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(data + " inserted.");
    }

    // Dequeue
    public void dequeue() {

        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println(front.data + " deleted.");

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    // Peek
    public void peek() {

        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Front element: " + front.data);
    }

    // Display
    public void display() {

        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = front;

        System.out.print("Queue: ");

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    // IsEmpty
    public void isEmpty() {

        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is not empty.");
        }
    }

    public static void main(String[] args) {

        QueueUsingLinkedList obj = new QueueUsingLinkedList();

        while (true) {

            System.out.println("\n------ QUEUE MENU ------");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. IsEmpty");
            System.out.println("5. Peek");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int ch = obj.sc.nextInt();

            switch (ch) {

                case 1:
                    obj.enqueue();
                    break;

                case 2:
                    obj.dequeue();
                    break;

                case 3:
                    obj.display();
                    break;

                case 4:
                    obj.isEmpty();
                    break;

                case 5:
                    obj.peek();
                    break;

                case 0:
                    System.out.println("Exited.");
                    obj.sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
