import java.util.HashMap;

public class CountFrequencyOfElementUsingHashMap {
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,3,5};
        countFreq(arr);
    }
    public static void countFreq(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println(freq);
    }
}
