import java.util.ArrayList;
import java.util.*;
public class even_removal {

    public static void main(){
        ArrayList <Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers you wanna work upon");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" numbers of your choice:");
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            arr.add(num);
        }
        for(int j=0;j<arr.size();j++){
            if(arr.get(j)%2==0)
                arr.remove(j);
        }
        System.out.println("Complete new arraylist:");
        System.out.println(arr);
    }
}