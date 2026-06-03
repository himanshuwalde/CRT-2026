import java.util.HashMap;

public class MergeTwoHashMaps {
    public static HashMap<String, Object> mergeMaps(HashMap<String, Object> map1, HashMap<String, Object> map2) {
        map1.putAll(map2);
        return map1;
    }
    public static void main(String[] args) {
        HashMap<String, Object> map1 = new HashMap<>();
        map1.put("name", "Himanshu");

        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("age", 21);

        HashMap<String, Object> mergedMap = mergeMaps(map1, map2);

        System.out.println(mergedMap);
    }
}
