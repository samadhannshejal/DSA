class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int op=0;
        int tp=0;
        for(int i=0;i<prices.length;i++){
             if(min>prices[i]){
                min=prices[i];
             }
             tp=prices[i]-min;
             op=Math.max(op,tp);
        }

        return op;
    }
}