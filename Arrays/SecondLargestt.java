package Arrays;
import java.util.*;
public class SecondLargestt {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    System.out.println("enter number of element:");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter array elements:");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    int largest =arr[0];
        int secondLargest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){

                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        
        System.out.println("second largest  element is:" +  secondLargest);
        sc.close();
    }
}


