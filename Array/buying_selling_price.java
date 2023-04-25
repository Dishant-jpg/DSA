import java.util.*;
public class buying_selling_price{
    public static int buyingSellingPrice(int sellingPrice[]){
        int BuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<sellingPrice.length; i++){
            if(BuyPrice<sellingPrice[i] ){
                int profit = sellingPrice[i] - BuyPrice; //today profit
                maxProfit = Math.max(maxProfit, profit); // whole array maximum profit
            }else{
                BuyPrice = sellingPrice[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int sellingPrice[] = {7,1,5,3,6,4};
        System.out.println(buyingSellingPrice(sellingPrice));
    }
}