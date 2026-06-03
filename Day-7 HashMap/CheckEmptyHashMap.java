import java.util.HashMap;

public class CheckEmptyHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Himanshu");
        isEmpty(map);
    }
    public static void isEmpty(HashMap<Integer, String> map){
        if(map.isEmpty()){
            System.out.println("Empty");
        }
        else{
            System.out.println("Not Empty");
        }
    }
}
