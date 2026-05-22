// Problem: Two Sum
// Pattern: Brute Force
// Difficulty: Easy
// Time Complexity: O(n^2)
// Space Complexity: O(1)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int key = 0; key < n; key++) {
            for (int i = key + 1; i < n; i++) {
                if (nums[key] + nums[i] == target) {
                    return new int[]{key, i};
                }
            }
        }

        return new int[]{};
    }
}
