import java.util.*;
public class Palindrome {
    public static void palindrome(int p){
        int num = p;
        int rem ;
       int reverse = 0;
       while(p>0){
        rem = p%10;
        reverse = reverse *10 + rem;
        p = p/10;
       }
       if(num == reverse){
        System.out.println("pallindrome number");
       }
       else{
        System.out.println("not a pallindrome number");
       }
    }
    
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        palindrome(n);
       sc.close();
     }
    }

