// Problem: Best-Time-To-Buy-And-Sell-Stock (Leetcode #121)
// Pattern: Tracking min/greedy 
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) 
    {
        int profit=0;
        int buy=prices[0];
        
        for(int i=0;i<prices.length;i++)
        {
          if(prices[i]<buy)
          {
            buy=prices[i];
          }    
          else
          {
             profit=Math.max(profit,prices[i]-buy);
          }
        }
        return profit;
    }

}

// Approach:
// 1. Initialize profit = 0 and buy = prices[0].
// 2. Traverse the array.
// 3. Update buy whenever a smaller price is found.
// 4. Calculate current profit as prices[i] - buy.
// 5. Update maximum profit using Math.max().
// 6. Return final profit.
