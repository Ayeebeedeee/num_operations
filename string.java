import java.util.*;
public class string {
    public static void main(String[] args) {
        HashMap<Character, Integer> h = new HashMap<>();
        String s="abcdabcababcde";
        int l = s.length();
        int maxlen=0;
        int left=0;
        for(int i = 0; i<l;i++){
            char ch=s.charAt(i);
            if (h.containsKey(ch)) {
                left=Math.max(left,h.get(ch)+1);
            }
            h.put(ch, i);
            maxlen = Math.max(maxlen, i-left+1);
        }
        System.out.println("Maximum length:"+maxlen);
    }
}
