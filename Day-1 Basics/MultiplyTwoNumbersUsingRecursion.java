// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       System.out.print(mul(2, 3));
    }
    public static int mul(int x, int y) {
        if(x == 0 || y == 0) {
            return 0;
        }
        else if(x == 1) {
            return y;
        }
        else if(y == 1) {
            return x;
        }
        else {
            return x+mul(x, y-1);
        }
    }
}
