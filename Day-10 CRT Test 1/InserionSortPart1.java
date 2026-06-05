// Sorting
// One common task for computers is to sort data. For example, people might want to see all their files on a computer sorted by size. Since sorting is a simple 
// problem with many different possible solutions, it is often used to introduce the study of algorithms.

// Insertion Sort
// These challenges will cover Insertion Sort, a simple and intuitive sorting algorithm. We will first start with a nearly sorted list.

// Insert element into sorted list
// Given a sorted list with an unsorted number  in the rightmost cell, can you write some simple code to insert  into the array so that it remains sorted?
// Since this is a learning exercise, it won't be the most efficient way of performing the insertion. It will instead demonstrate the brute-force method in detail.
// Assume you are given the array arr = [1,2,4,5,3] indexed 0...4. Store the value of arr[4]. Now test lower index values successively from 3 to 0 until you reach 
// a value that is lower than arr[4], at arr[1] in this case. Each time your test fails, copy the value at the lower index to the current index and print your 
// array. When the next lower indexed value is smaller than arr[4], insert the stored value at the current index and print the entire array.

// Example
// n = 5
// arr = [1,2,4,5,3]
// Start at the rightmost index. Store the value of arr[4] = 3. Compare this to each element to the left until a smaller value is reached. Here are the results 
// as described:

// 1 2 4 5 5
// 1 2 4 4 5
// 1 2 3 4 5

// Function Description
// Complete the insertionSort1 function in the editor below.
// insertionSort1 has the following parameter(s):
// n: an integer, the size of 
// arr: an array of integers to sort

// Returns
// None: Print the interim and final arrays, each on a new line. No return value is expected.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static void insertionSort1(int n, List<Integer> arr) {
    int value = arr.get(n - 1);

    for (int i = n - 2; i >= 0; i--) {
        if (arr.get(i) > value) {
            arr.set(i + 1, arr.get(i));
            printArray(arr);
        } else {
            arr.set(i + 1, value);
            printArray(arr);
            return;
        }
    }

    // value is the smallest element
    arr.set(0, value);
    printArray(arr);
}

    private static void printArray(List<Integer> arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }    
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
