// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       System.out.print(pow(2, 3));
    }
    public static int pow(int x, int y) {
        if(y == 0) {
            return 1;
        }
        else if(x == 1 || y == 1) {
            return x;
        }
        else if(x == 0) {
            return 0;
        }
        else {
            return x*pow(x, y-1);
        }
    }
}
