//max subArray sum
package Arrays;

import java.util.Scanner;

public class Max_subArray_sum {
   
    public static void printMax_subArray_sum(int arr[]){
       int currSum = 0 ;
       int maxSum = Integer.MIN_VALUE;
        
        System.out.println("SubArrays :");
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                currSum = 0;
                for(int k=start;k<=end;k++){
                   System.out.print(arr[k] + " ");//SubArray
                   currSum +=arr[k];
                }
                System.out.println("\nsum of sub array is :" +  currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
               
                System.out.println();
            }

            System.out.println();
        }
        System.out.println("Maximun sum is : " + maxSum); 
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
        printMax_subArray_sum(arr);
        sc.close();
    }
}
// sub array formula = (n*(n+1))/2
 

