// Problem: Find Pivot Index (Leetcode #724)
// Pattern: Prefix sum pattern
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int pivotIndex(int[] nums) {

        int totalsum = 0;

        for (int num : nums) {
            totalsum += num;
        }

        int leftsum = 0;

        for (int i = 0; i < nums.length; i++) {

            int rightsum = totalsum - leftsum - nums[i];

            if (leftsum == rightsum) {
                return i;
            }

            leftsum += nums[i];
        }

        return -1;
    }
}

/* Approach:
1. Calculate total sum of the array.
2. Maintain a running leftSum while traversing.
3. Compute rightSum using:
   rightSum = totalSum - leftSum - nums[i]
4. If leftSum == rightSum, return the index.
5. If no pivot exists, return -1. */
