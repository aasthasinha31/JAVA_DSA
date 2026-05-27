public class buysell {
    public static int stocks(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        
        int maxprofit = 0;
         for(int i = 0 ; i<prices.length ; i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(profit, maxprofit);
            }
        else{ 
            buyprice = prices[i];

        }
        
       }
       return maxprofit;
    }
    public static void main(String[] args) {
        int prices[] = {1,3,4,2,3,6};
        System.out.println("max profit is : " + stocks(prices));
    }
    
}
