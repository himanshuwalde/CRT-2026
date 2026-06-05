// Amount of Food
// The function accepts two positive integers r and unit and a positive integer array arr of size n as its argument.
// r represents the number of rats present in an area.
// unit is the amount of food each rat consumes.
// Each ith element of array arr represents the amount of food present in the (i+1)th house.

// Notes
// Return -1 if the array is null (or empty).
// Return 0 if the total amount of food from all houses is not sufficient for all the rats.
// Computed values lie within the integer range.

// Example

// Input
// r = 7
// unit = 2
// n = 8
// arr = {2, 8, 3, 5, 7, 4, 1, 2}

// Output
// 4

// Explanation
// Total amount of food required for all rats: r * unit = 7 * 2 = 14

// Food available in the first houses: 2 + 8 + 3 + 5 = 18

// Since the food in the first 4 houses is sufficient for all the rats, the answer is: 4

import java.util.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if(n == 0) {
            System.out.println(-1);
            return;
        }

        int foodRequired = r * unit;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum >= foodRequired) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println(0);
    }
}
