class Solution {
    public int maxProfit(int[] prices) {
        int i=0,j=1;
        int max=0;
        while(j<prices.length){
            int diff=prices[j]-prices[i];
            max=Math.max(diff,max);
            if(prices[i]>prices[j]) i++;
            else{
                j++;
            }
        }
        return max;
    }
}
