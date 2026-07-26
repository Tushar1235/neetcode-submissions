class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;

        for(int i=0;i<prices.length;i++) {
            int sum =0;
            for(int j=i+1;j<prices.length;j++) {

                if(prices[i] < prices[j]) {
                    sum = prices[j] - prices[i];
                }
                max= Math.max(max,sum);
            }
        }
        return max;

    }
}
