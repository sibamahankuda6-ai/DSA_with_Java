import java.util.*;
public class practics_15 {
    public static boolean isEven(int n){
       if(n%2==0){
        return true;
       } 
       return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        System.out.println("the number is even ==true or odd == false :::" + isEven(n));
        sc.close();
    }
    
}
