import java.util.*;

public class ReverseQueueUsingStack {

    // Queue Variables
    int queue[];
    int size;
    int front;
    int rear;

    // Stack Variables
    int stack[];
    int top;
    final int CAPACITY;

    ReverseQueueUsingStack(int n) {

        // Queue Initialization
        size = n;
        queue = new int[size];
        front = 0;
        rear = -1;

        // Stack Initialization
        CAPACITY = n;
        stack = new int[CAPACITY];
        top = -1;
    }

    // ================= QUEUE METHODS =================

    public void insert(int data) {

        if (isQueueFull()) {
            System.out.println("Queue is full");
            return;
        }

        queue[++rear] = data;
    }

    public int delete() {

        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int data = queue[front];

        for (int i = 1; i <= rear; i++) {
            queue[i - 1] = queue[i];
        }

        rear--;

        return data;
    }

    public int peekQueue() {

        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];
    }

    public boolean isQueueFull() {
        return rear == size - 1;
    }

    public boolean isQueueEmpty() {
        return rear == -1;
    }

    public void display() {

        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }

    // ================= STACK METHODS =================

    public void push(int data) {

        if (isStackFull()) {
            System.out.println("Stack is full");
            return;
        }

        stack[++top] = data;
    }

    public int pop() {

        if (isStackEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top--];
    }

    public int peekStack() {

        if (isStackEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }

    public boolean isStackFull() {
        return top == CAPACITY - 1;
    }

    public boolean isStackEmpty() {
        return top == -1;
    }

    public void traverseStack() {

        if (isStackEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack: ");

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }

    // ================= MAIN =================

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};

        ReverseQueueUsingStack obj =
                new ReverseQueueUsingStack(arr.length);

        // Insert into Queue
        for (int i = 0; i < arr.length; i++) {
            obj.insert(arr[i]);
        }

        System.out.println("Original Queue:");
        obj.display();

        // Move Queue -> Stack
        for (int i = 0; i < arr.length; i++) {
            obj.push(obj.delete());
        }

        // Move Stack -> Queue
        for (int i = 0; i < arr.length; i++) {
            obj.insert(obj.pop());
        }

        System.out.println("Reversed Queue:");
        obj.display();
    }
}
