 import java.util.*;

public class Decimal_to_binary {
   
      public static void decTobin(int decNum){
        int num = decNum;
        int pow =0;
        int binNum = 0;
        while(decNum>0){
            int lastDigit = decNum % 2;
            binNum = binNum + (lastDigit * (int)Math.pow(10, pow));
            pow++;
            decNum = decNum/2;
        }
        System.out.println("binary of " + num + " =" + binNum);
      }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int num = sc.nextInt();
        decTobin(num);
        sc.close();
    }
}


