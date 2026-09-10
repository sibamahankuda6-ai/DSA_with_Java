package Arrays;

import java.util.Scanner;
public class SquareRoot {
    public static int mySqrt(int x) {

       
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int answer = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                answer = mid;

                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        int result = mySqrt(x);

        System.out.println("Square root = " + result);

        sc.close();
    }
}

