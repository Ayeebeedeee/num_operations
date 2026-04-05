import java.util.*;
public class freq {
    public static void main(String[] args) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int arr[] = {4,5,4,5,5,4,5};
        for(int num : arr){
            h.put(num,h.getOrDefault(num, 0)+1);
        }
        System.out.println("Frequencies:");
        for(int k : h.keySet()){
            System.out.println(k+"->"+h.get(k));
        }
    }
}
