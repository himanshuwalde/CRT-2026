public class ReverseArrayUsingStack {
    int top;
    final int CAPACITY;
    int[] stack;

    ReverseArrayUsingStack(int size) {
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
            System.out.println("Stack is Full");
            return;
        }
        stack[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        ReverseArrayUsingStack st = new ReverseArrayUsingStack(arr.length);

        // Push all elements into stack
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }

        // Pop elements back into array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.pop();
        }

        // Print reversed array
        System.out.println("Reversed Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
