import java.util.*;
public class practics5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        if((year%4==0) || (year%400==0)){
            System.out.println("this year is a leap year");
        }
        else {
            System.out.println("not a leap year");
        }
        
    }
}
