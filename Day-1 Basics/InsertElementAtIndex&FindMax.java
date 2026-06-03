// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        int n, key, loc;
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println("Enter the key value: ");
        // key = sc.nextInt();
        // System.out.println("Enter the location: ");
        // loc = sc.nextInt();
        // for(int i = n-1; i>=loc; i--) {
        //     arr[i+1] = arr[i];
        // }
        // arr[loc] = key;
        // for(int i = 0; i<=n; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum number: "+max);
    }
}
