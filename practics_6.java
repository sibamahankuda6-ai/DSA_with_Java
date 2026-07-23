import java.util.*;
public class practics_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("positive number");
        }
        else if(n<0){
            System.out.println("negative number");
        }
        else{
            System.out.println("zero");
        }
    }
}
