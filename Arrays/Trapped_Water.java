package Arrays;
import java.util.*;
public class Trapped_Water {
    public static int trappedRainWater(int height[]){
        //calculate left max boundary array -array
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }

        // calculate right max booundary -array

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];

        for(int i=n-2;i>=0;i--){
           rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop
        for(int i=0;i<n;i++){
            //water level = min(leftmax bound , rrightmax bound)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int height[] = new int[n];
        System.out.println("Enter the hights of bar :");
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        System.out.println("Trapped rain water is: " + trappedRainWater(height));
        sc.close();
    }
    
}
