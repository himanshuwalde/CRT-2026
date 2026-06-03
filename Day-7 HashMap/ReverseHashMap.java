import java.util.HashMap;
import java.util.Map;

public class ReverseHashMap {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        System.out.println("Before Reversing: "+map);
        System.out.println("After Reversing: "+reverse(map));
    }
    public static HashMap<Integer, String> reverse(HashMap<String, Integer> map){
        HashMap<Integer, String> rev = new HashMap<>();
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            rev.put(entry.getValue(), entry.getKey());
        }
        return rev;
    }
}
