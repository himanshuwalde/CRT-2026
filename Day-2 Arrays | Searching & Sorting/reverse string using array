public class ReverseStringUsingArray {

    int top;
    final int CAPACITY;
    char[] stack;

    ReverseStringUsingArray(int size) {
        top = -1;
        CAPACITY = size;
        stack = new char[CAPACITY];
    }

    public boolean isFull() {
        return top == CAPACITY - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char data) {

        if (isFull()) {
            System.out.println("Stack is full.");
            return;
        }

        stack[++top] = data;
    }

    public char pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return '\0';
        }

        return stack[top--];
    }

    public static void main(String[] args) {

        String s = "Sir";

        char[] arr = s.toCharArray();

        ReverseStringUsingArray st =
                new ReverseStringUsingArray(arr.length);

        // Push all characters
        for (char ch : arr) {
            st.push(ch);
        }

        // Pop back to reverse
        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.pop();
        }

        System.out.println("Original String: " + s);
        System.out.println("Reversed String: " + new String(arr));
    }
}
