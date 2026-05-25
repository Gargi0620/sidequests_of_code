// Problem: Maximum-Sum-Subarray (Leetcode #53)
// Pattern: Kadane's Algorithm (At each index, is it better to: 1. start a new subarray OR 2. continue the previous one?)
// Difficulty: Medium
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxSubArray(int[] nums) {
        int Maxsum=nums[0];
        int currentSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currentSum=Math.max(nums[i],currentSum+nums[i]);
            Maxsum=Math.max(Maxsum,currentSum);
        }
        return Maxsum;
    }
}

// Approach:
// 1. Initialize maxSum = nums[0] and currentSum = nums[0].
// 2. Traverse the array starting from index 1.
// 3. At each index, decide whether to:
//    a) start a new subarray from current element
//    b) continue the previous subarray
// 4. Update currentSum using:
//   currentSum = Math.max(nums[i], currentSum + nums[i])
// 5. Update maxSum with the maximum value found so far.
// 6. Return maxSum.
