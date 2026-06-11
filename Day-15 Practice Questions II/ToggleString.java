import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }
            else{
                sb.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(sb);
    }
}
