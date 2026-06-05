// Insert a Node at the Tail of a Linked List
// This challenge is part of a tutorial track by MyCodeSchool and is accompanied by a video lesson.
// You are given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer. 
// Insert this node at the tail of the linked list and return the head node of the linked list formed after inserting this new node.
// The given head pointer may be null, meaning that the initial list is empty.

// Function Description

// Complete the insertNodeAtTail function with the following parameters:
// SinglyLinkedListNode pointer head: a reference to the head of a list
// int data: the data value for the node to insert

// Returns
// SinglyLinkedListNode pointer: reference to the head of the modified linked list

// Input Format
// The first line contains an integer n, the number of elements in the linked list.
// The next n lines contain an integer each, the value that needs to be inserted at tail.

// Sample Input
// 5
// 141
// 302
// 164
// 530
// 474
// Sample Output
// 141
// 302
// 164
// 530
// 474

// Explanation
// Initially, the linked list is NULL.

// After inserting:

// 141 -> NULL
// 141 -> 302 -> NULL
// 141 -> 302 -> 164 -> NULL
// 141 -> 302 -> 164 -> 530 -> NULL
// 141 -> 302 -> 164 -> 530 -> 474 -> NULL

// The final linked list is:

// 141 -> 302 -> 164 -> 530 -> 474 -> NULL

import java.io.*;
import java.util.*;

public class InsertNodeAtTailOfLL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
