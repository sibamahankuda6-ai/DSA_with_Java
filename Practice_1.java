import java.util.*;
public class Practice_1 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter 1st number");
       int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
         System.out.println("Enter 3rd number");
         int c = sc.nextInt();
         int sum = a+b+c;
         int avg = sum/3;
         System.out.println("average is " + avg);
         sc.close();
    }

}
