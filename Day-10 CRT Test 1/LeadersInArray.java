// Find the Leaders in the Array

// Given an array A of positive integers. Your task is to find the leaders in the array. An element of the array is a leader if it is greater than or equal to all the elements to its right side.

// The rightmost element is always a leader.

// Example 1

// Input:

// n = 6
// A[] = {16,17,4,3,5,2}

// Output:

// 17 5 2

// Explanation:

// 17 is greater than all elements to its right.
// 5 is greater than all elements to its right.
// The rightmost element 2 is always a leader.
// Example 2

// Input:

// n = 5
// A[] = {1,2,3,4,0}

// Output:

// 4 0

import java.io.*;
import java.util.*;

public class LeadersInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            int j = i + 1;

            while (j < n && temp >= arr[j]) {
                j++;
            }

            if (j == n) {
                System.out.print(temp + " ");
            }
        }
    }
}
