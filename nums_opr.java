
import java.util.*;
class nums_opr{
    public static void main(){
        ArrayList<Integer> arr= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 numbers of your choice");
        for (int i =0;i<5;i++)
        {
            int x = sc.nextInt();
            arr.add(x);
        }
        int s=0;
        int max=0;
        double avg = 0.0;
        for (int j=0;j<5;j++)
        {
            s=s+arr.get(j);
            if(arr.get(j)>max)
                max=arr.get(j);
        }
        avg=s/5.0;
        System.out.println("Maximum number:"+max);
        System.out.println("Sum:"+s);
        System.out.println("Average:"+avg);
    }
}