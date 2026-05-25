// Problem: Remove Duplicated From Sorted Array (Leetcode #121)
// Pattern: Two pointers 
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; 

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}

// Approach:
// 1. Edge case: If the array is empty, return 0.
// 2. Initialize i = 0 to track the last unique element.
// 3. Traverse the array using j from index 1.
// 4. If nums[j] != nums[i]:
//    a) Increment i
//    b) Replace nums[i] with nums[j]
// 5. Return i + 1 as the count of unique elements.
