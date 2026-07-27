import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int count = 0;
       System.out.println("Enter a number: ");
       int num = sc.nextInt(); 
       for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
       }
       if(count == 2){
        System.out.println("prime number");
       }
       else {
        System.out.println("not a prime number");
       }
       sc.close();
    }
}
