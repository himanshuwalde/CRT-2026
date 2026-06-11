import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        double ans = 1;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            ans *= arr[i] % (Math.pow(10, 9) + 7);
        }
        System.out.println((int)(ans));
        
    }
}
