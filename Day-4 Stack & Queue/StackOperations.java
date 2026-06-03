import java.util.Scanner;

class Stacks {
    int top;
    final int CAPACITY;
    int[] stack;

    Stacks(int size) {
        top = -1;
        CAPACITY = size;
        stack = new int[CAPACITY];
    }

    public boolean isFull() {
        return top == CAPACITY - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is Full.");
            return;
        }

        stack[++top] = data;
        System.out.println(data + " pushed into stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return -1;
        }

        return stack[top--];
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return;
        }

        System.out.println("Peek Element: " + stack[top]);
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return;
        }

        System.out.print("Stack Elements: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of stack: ");
        int n = sc.nextInt();

        Stacks st = new Stacks(n);

        while (true) {
            System.out.println("\n===== STACK MENU =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Traverse");
            System.out.println("0. Exit");
            System.out.print("Select any choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the data: ");
                    int data = sc.nextInt();
                    st.push(data);
                    break;

                case 2:
                    int x = st.pop();
                    if (x != -1) {
                        System.out.println("Popped Element: " + x);
                    }
                    break;

                case 3:
                    st.peek();
                    break;

                case 4:
                    st.traverse();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
