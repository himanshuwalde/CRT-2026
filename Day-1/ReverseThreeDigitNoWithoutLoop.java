// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int num = 123;
        int i = num%10;
        int j = (num/10)%10;
        int k = (num/100)%10;
        System.out.print("Number: "+i+j+k);
    }
}
