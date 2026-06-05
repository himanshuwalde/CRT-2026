// Capgemini in its Online Written Test

// Capgemini in its online written test has a coding question, wherein the students are given a string with multiple characters that are repeated consecutively.
// You're supposed to reduce the size of this string using the mathematical logic given in the examples below:

// Example 1

// Input:
// aabbbbeeeefffggg

// Output:
// a2b4e4f2g3

// Example 2

// Input:
// abbccccc

// Output:
// ab2c5

import java.io.*;
import java.util.*;

public class CountCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            int count = 1;

            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }

            System.out.print(s.charAt(i));

            if (count > 1) {
                System.out.print(count);
            }
        }
    }
}
