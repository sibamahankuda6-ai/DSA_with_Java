package Arrays;

import java.util.Scanner;

public class Max_subArray_sum_3 {
    //  public static void printMax_subArray_sum(int arr[]){
    //    int currSum = 0 ;
    //    int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[arr.length];

    //     prefix[0] = arr[0];
    //    for(int i=1;i<prefix.length;i++){
    //     prefix[i] = prefix[i-1] + arr[i];
    //    }

    //     for(int i=0;i<arr.length;i++){
    //         int start = i;
    //         for(int j=i;j<arr.length;j++){
    //             int end = j;
    //             currSum = start == 0 ? prefix[end]:prefix[end] - prefix[start-1];
                
    //             if(maxSum < currSum){
    //                 maxSum = currSum;
    //             }  
    //         }
    //     }
    //     System.out.println("Maximun sum is : " + maxSum);
       
    // }

    // kadanes algorithm for maximum subArray  sum

    public static void kadanesAlgorithm(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<arr.length;i++){
            currSum = currSum + arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("our max subArray sum is:" + maxSum);
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
        kadanesAlgorithm(arr);
        sc.close();
    }
}

// time complexity = O(n)
