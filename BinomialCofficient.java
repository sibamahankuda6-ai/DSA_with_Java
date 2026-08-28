import java.util.*;
public class BinomialCofficient {
    public static int fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static int biocoff(int f, int r){
        int fact_f = fact(f);
        int fact_r = fact(r);
        int factfr = fact(f-r);
        int biocof = fact_f/(fact_r*factfr);
        return biocof;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  a number: ");
        int f = sc.nextInt();
        System.out.println("enter  a number: ");
        int r = sc.nextInt();
        System.out.println("BionomialCofficient");
       System.out.println(biocoff(f,r));
       sc.close();
    }

}
