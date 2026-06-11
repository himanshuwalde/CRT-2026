// Solution 1
import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int N = sc.nextInt();

        while (N > 0) {
            int W = sc.nextInt();
            int H = sc.nextInt();

            if (W < L || H < L) {
                System.out.println("UPLOAD ANOTHER");
            } 
            else if (W == H) {
                System.out.println("ACCEPTED");
            } 
            else {
                System.out.println("CROP IT");
            }
            N--;
        }
    }
}

// Solution 2
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            int w = arr[i][0];
            int h = arr[i][1];
            if(w < l || h < l){
                System.out.println("UPLOAD ANOTHER");
            }
            else if(w == h){
                System.out.println("ACCEPTED");
            }
            else{
                System.out.println("CROP IT");
            }  
        }        
    }
}
Language: Java 17
