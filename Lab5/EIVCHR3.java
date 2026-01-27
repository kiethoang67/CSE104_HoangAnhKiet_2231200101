package Lab5;

import java.util.Scanner;
import java.util.Arrays;

public class EIVCHR3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfItem = sc.nextInt();
        int numOfVoucher = sc.nextInt();
        
        long[] prices = new long[numOfItem];
        long totalMoney = 0;
        
        for (int i = 0; i < numOfItem; i++){
            prices[i] = sc.nextLong();
            totalMoney += prices[i];
        }
        
        
        Arrays.sort(prices);
        
        
        long totalDiscount = 0;
        for (int i = 0; i < Math.min(numOfItem, numOfVoucher); i++) {
            long itemPrice = prices[numOfItem - 1 - i]; 
            long discount = (itemPrice * 3) / 10;  
            if (discount > 50000) {
                discount = 50000;
            }
            totalDiscount += discount;
        }
        
        long amountToPay = totalMoney - totalDiscount;
        System.out.println(amountToPay);
    }
}
