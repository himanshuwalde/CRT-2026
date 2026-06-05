// Next Larger Element

// You are given an array arr of integers of length N. For each element in the array, find the next element to its right which is larger than it.
// If there is no such element, output -1 for that element.

// Input Format
// The first line contains an integer N, the size of the array.
// The second line contains N space-separated integers representing the elements of the array.

// Output Format
// Output N space-separated integers representing the next larger element for each element in the array.

// If there is no such element, output -1.

// Sample Input 
// 4
// 1 3 2 4
// Sample Output 
// 3 4 4 -1

import java.io.*;
import java.util.*;

public class NextLargerElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int temp = arr[i];

            for (int j = i + 1; j < n; j++) {
                if (temp < arr[j]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
        }

        System.out.print("-1");
    }
}
