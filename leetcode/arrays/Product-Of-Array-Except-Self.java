// Problem: Product-Of-Array-Except-Self (#238 leetcode)
// Pattern: Prefix+Suffix
// Difficulty: Medium
// Time Complexity: O(n)
// Space Complexity: O(1)

 class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];

        answer[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        int suffix = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffix;
            suffix *= nums[i];
        }

        return answer;
    }
}

// Approach:
// 1. Create an answer array
// 2. Store prefix products in answer[]
//    answer[i] = product of all elements LEFT of i
// 3. Traverse from right to left using a suffix variable
//    suffix = product of all elements RIGHT of i
// 4. Multiply current prefix product with suffix
//    answer[i] = answer[i] * suffix
// 5. Update suffix
//    suffix *= nums[i]
// 6. Return answer array
