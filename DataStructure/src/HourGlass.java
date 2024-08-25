import java.util.ArrayList;
import java.util.List;

public class HourGlass {

    public static void main(String[] args) {
        // Step 1: Initialize the 6x6 2D ArrayList
        List<List<Integer>> arr = new ArrayList<>();

        // Step 2: Populate the 2D ArrayList with sample values
        for (int i = 0; i < 6; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
//                row.add((int) (Math.random() * 10)); // Random values from 0-9 for simplicity
                row.add((int) (Math.random() * 19) - 9); // Random values from -9 to 9 for simplicity

            }
            arr.add(row);
        }

        // Print the 2D ArrayList (for verification)
        for (List<Integer> row : arr) {
            System.out.println(row);
        }

        // Step 3: Calculate the maximum hourglass sum
        int maxSum = hourglassSum(arr);
        System.out.println("Maximum Hourglass Sum: " + maxSum);
        hourglassSum(arr);
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;

        // Iterate through the 2D array, skipping the edges (only valid hourglasses)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Calculate the hourglass sum
                int sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2) // Top row
                        + arr.get(i + 1).get(j + 1)                                       // Middle element
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2); // Bottom row

                // Update the maximum sum
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}
