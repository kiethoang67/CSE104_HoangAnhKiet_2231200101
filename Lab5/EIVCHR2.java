package Lab5;

import java.util.Scanner;

public class EIVCHR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfItem = sc.nextInt();
        long[] prices = new long[numOfItem];
        long maxPrice = 0;
        long totalMoney = 0;
        
        for (int i = 0; i < numOfItem; i++){
            long money = sc.nextLong();
            prices[i] = money;
            totalMoney += money;
            maxPrice = Math.max(maxPrice, money);
        }
        long discount = (maxPrice * 3) / 10;
        if (discount > 50000) {
            discount = 50000;
        }
        
        long amountToPay = totalMoney - discount;
        System.out.println(amountToPay);
    }
}
