import java.util.*;
public class SumOfDigits {
    public static int sumOfDigit(int n){
        int sum = 0;
        int rem;
        while(n>0){
            rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbe: ");
        int n = sc.nextInt();
        System.out.println("sum of digit is :" + sumOfDigit(n));
        sc.close();
    }
}
