import java.util.*;
public class Binary_to_Decimal {
   
      public static void binTodec(int binNum){
        int num = binNum;
        int pow =0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " + num + " =" + decNum);
      }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        int num = sc.nextInt();
        binTodec(num);
        sc.close();
    }
}
