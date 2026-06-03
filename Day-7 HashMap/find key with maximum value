import java.util.HashMap;
import java.util.Map;

public class KeyWithMaximumValue {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 50);
        map.put("B", 60);
        map.put("C", 70);
        maxValue(map);
    }
    public static void maxValue(HashMap<String, Integer> map){
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        System.out.println(maxKey);
    }
}
