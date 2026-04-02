package student;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<call> arr = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id, marks and names of the students accordingly in this order only");
        System.out.println("Also mention the number of students on which you wanna perform these actions");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter id");
            int a=sc.nextInt();
            System.out.println("Enter name");
            String s=sc.next();
            System.out.println("Enter marks");
            int m=sc.nextInt();
            arr.add(new call(i, s, m));
        }
        int max=0;
        String ans = "";
        for(call s : arr){
            if(s.marks>max){
                ans=s.name;
                max=s.marks;
            }
        }
        System.out.println("Final data:");
        for (call j : arr) {
            System.out.println("Id:"+j.id+", name:"+j.name+", marks:"+j.marks);
        }
        System.out.println("Maximum marks is of "+ans+":"+max);
    }
}
