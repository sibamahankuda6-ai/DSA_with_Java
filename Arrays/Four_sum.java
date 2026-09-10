package Arrays;
import java.util.*;
public class Four_sum {
  

    public static List<List<Integer>> fourSum(int[] nums, long target) {

        List<List<Integer>> result = new ArrayList<>();

        // Sort the array
        Arrays.sort(nums);

        int n = nums.length;

        // First number
        for (int i = 0; i < n - 3; i++) {

            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Second number
            for (int j = i + 1; j < n - 2; j++) {

                // Skip duplicate values for j
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // Two pointers
                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    // Use long to prevent integer overflow
                    long sum = (long) nums[i]
                             + nums[j]
                             + nums[left]
                             + nums[right];

                             
                    if (sum == target) {

                        // Add quadruplet
                        result.add(Arrays.asList(
                            nums[i],
                            nums[j],
                            nums[left],
                            nums[right]
                        ));

                        // Skip duplicate left values
                        while (left < right &&
                               nums[left] == nums[left + 1]) {
                            left++;
                        }

                        // Skip duplicate right values
                        while (left < right &&
                               nums[right] == nums[right - 1]) {
                            right--;
                        }

                        // Move both pointers
                        left++;
                        right--;

                    } else if (sum < target) {

                        // Increase sum
                        left++;

                    } else {

                        // Decrease sum
                        right--;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Create array
        int[] nums = new int[n];

        // Input array
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter target: ");
        long target = sc.nextLong();

        // Call fourSum
        List<List<Integer>> result = fourSum(nums, target);

        // Print result
        System.out.println("Unique quadruplets:");

        System.out.println(result);

        sc.close();
    }
}


