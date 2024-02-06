public class twosum {

    public static int[] twoSum(int[] nums, int target) {
        // Iterate through each pair of numbers in the array
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of the current pair equals the target
                if (nums[i] + nums[j] == target) {
                    // If found, return the indices of the two numbers
                    return new int[] { i, j };
                }

            }

        }

        // If no solution is found, return an empty array (this should not happen based
        // on the problem statement)
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 18;

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices of the two numbers that add up to the target: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
