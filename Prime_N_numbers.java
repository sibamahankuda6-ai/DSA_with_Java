import java.util.*;
public class Prime_N_numbers {
  public static boolean prime(int n){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }  
        } 
        return count==2;
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("prime numbers are: ");
            for(int i=0;i<n;i++){
              if(prime(i)){
                System.out.println(i);
              }
            }
          sc.close();
        }
    }

