import java.util.*;
public class Swiitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yout choice(1,2,3)");
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("hello");
                break;
             case 2:
                System.out.println("hii");
                break;
             case 3:
                System.out.println("good morning");
                break;
             default:
                System.out.println(
                    "invalid choice"
                );

        }

        sc.close();
    }
}
