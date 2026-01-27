package Lab5;

import java.util.Scanner;

public class EIVCHR1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        long moneyDiscount = (money * 3) / 10;  
        if (moneyDiscount > 50000) {
            moneyDiscount = 50000;
        }
        long actualMoney = money - moneyDiscount;
        System.out.println(actualMoney);
    }
}
