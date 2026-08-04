import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int fact =1;
       System.out.println("Enter a number:");
       int num = sc.nextInt();
       for(int i=1;i<=num;i++){
         fact =fact*i;
       }
       System.out.println("factorial number is:" + fact);
       sc.close();
    }
}
