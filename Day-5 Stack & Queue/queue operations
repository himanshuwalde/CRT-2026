import java.util.Scanner;

class Queue {
    int queue[], size, front, rear;

    public Queue(int n) {
        size = n;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    public void insert(int data) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }

        rear++;
        queue[rear] = data;
        System.out.println(data + " is inserted");
    }

    public int delete() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        int data = queue[front];

        for (int i = 1; i <= rear; i++) {
            queue[i - 1] = queue[i];
        }

        rear--;

        return data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue Elements: ");
        for (int i = 0; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        return queue[front];
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of Queue: ");
        int n = sc.nextInt();

        Queue obj = new Queue(n);

        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Peek");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    obj.insert(data);
                    break;

                case 2:
                    data = obj.delete();
                    if (data != -1) {
                        System.out.println(data + " is deleted");
                    }
                    break;

                case 3:
                    obj.display();
                    break;

                case 4:
                    data = obj.peek();
                    if (data != -1) {
                        System.out.println("Front element: " + data);
                    }
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
