class Solution {
    public int maxProfit(int[] prices)
    {
        int left=0;
        int right=1;
        int profMax=0;
        
        while(right<prices.length)
        {
            profMax=Math.max(profMax,prices[right]-prices[left]);

            if(prices[left]>prices[right])
            {
                left=right;
            }

            right++;
        }

        return profMax;
        
    }
}
