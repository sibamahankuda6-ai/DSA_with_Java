package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Puls_one_problem {
    public static int[] plusOne(int[] digits) {

        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, simply increase it
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and carry 1
            digits[i] = 0;
        }

        // If all digits were 9, create a new array
        int[] result = new int[digits.length + 1];

        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] digits = new int[n];

        // Input digits
        System.out.println("Enter digits:");

        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        // Add one
        int[] result = plusOne(digits);

        // Print result
        System.out.println("Output: " + Arrays.toString(result));

        sc.close();
    }
}

