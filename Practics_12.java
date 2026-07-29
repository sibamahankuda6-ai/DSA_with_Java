import java.util.*;
public class Practics_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumEven = 0;
        int sumOdd = 0;
        System.out.println("enter no of integers:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int num =sc.nextInt();
            if(num%2==0){
                sumEven += num;
            }
            else{
                sumOdd += num;
            }
        }
        System.out.println("sum of even number is " + sumEven);
        System.out.println("sum of odd number is " + sumOdd);
    }
}
