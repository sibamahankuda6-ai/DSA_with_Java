public class ReverseNum {
    public static void main(String[] args) {
        // int n= 23456;
        // while(n>0){
        //     int lastDigit = n%10;
        //     System.out.print(lastDigit);
        //     n = n/10;
        // }
        // System.out.println();



        int n=12345;
         int reverse = 0;
        while(n>0){
            int rem =n%10;
            reverse = reverse*10+rem;
            n = n/10;
           
        }
         System.out.println("reverse number is: " + reverse );
    }
}
