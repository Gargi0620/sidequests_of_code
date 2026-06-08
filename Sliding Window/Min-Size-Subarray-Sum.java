// Minimum Size Subarray Sum(leetcode #209)
// Pattern: Sliding Window
// level: Easy
// Time Complexity : O(n)
//Space Complexity : O(1)

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int high=0;
        int sum=0;
        int minsize=Integer.MAX_VALUE;
        while(high<nums.length)
        {
            sum+=nums[high];
        
            while(sum>=target)
            {
                sum-=nums[low];
                minsize=Math.min(high-low+1,minsize);
                low++;
            }
            high++;
       } 
       if(minsize==Integer.MAX_VALUE)
       return 0;
    
    return minsize;
 }
}
