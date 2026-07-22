 import java.util.*;
 class Calculator{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter tow numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter your choice(+,-,*,/)");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println("adition " + (a+b));
                break;
            case '-':
                 System.out.println("subttraction " + (a-b));
                break;
             case '*':
                System.out.println("multiplication " + (a*b));
                break;
             case '/':
                System.out.println("division " + (a/b));
                break;
             default:
                System.out.println(
                    "invalid choice"
                );

        }

        sc.close();
    }
}