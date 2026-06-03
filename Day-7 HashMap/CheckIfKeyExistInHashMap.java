import java.util.HashMap;

public class CheckIfKeyExistInHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(100, "Himanshu");
        hm.put(102, "Soni");
        hm.put(101, "Walde");
        check(hm, 100);
    }
    public static void check(HashMap<Integer, String> hm, int key){
        if(hm.containsKey(key)){
            System.out.println("Key Exists");
        }
        else{
            System.out.println("Key does not Exists");

        }
    }
}
