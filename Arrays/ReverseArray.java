package Arrays;
import java.util.*;
public class ReverseArray {
    public static void  reversedArray(int arr[]){
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first++;
                last--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element:");
        int  n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
           arr[i] = sc.nextInt();
        }
        reversedArray(arr);
        System.out.println("reverse  array:");   //O(1)space complexity
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }


        // for(int i=arr.length-1;i>=0;i--){   O(n)space complexity
        //     System.out.println(arr[i]);
        // }
        sc.close();
    }
}
