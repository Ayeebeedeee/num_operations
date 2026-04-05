import java.util.HashMap;

public class sum {
    public static void main(String[] args) {
        int a[]={2,7,3,8};
        int t=9;
        HashMap<Integer, Integer> h=new HashMap<>();
        for(int i=0;i<4;i++){
            int c=t-a[i];
            if(h.containsKey(c)){
                System.out.println("Answer:["+h.get(c)+","+i+"]");
                return;
            }
            h.put(a[i], i);
        }
    }
}
