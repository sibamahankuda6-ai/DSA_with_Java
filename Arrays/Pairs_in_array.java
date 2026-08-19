package Arrays;
import java.util.*;;
public class Pairs_in_array {
    public static void pairsInArray(int arr[]){
        int tp = 0;
        System.out.println("pairs are:");
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print( "(" + current + "," + arr[j] + ")");
                tp++;
            }

            System.out.println();
        }
        System.out.println("total pairs are:" + tp);
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the number of element:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        pairsInArray(arr);
        sc.close();
    }
}
//time complexity = O(n2)
//total pairs formula = (n*(n-1))/2 