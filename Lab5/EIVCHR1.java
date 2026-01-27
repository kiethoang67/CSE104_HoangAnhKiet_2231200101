package Lab5;

import java.util.Scanner;

public class EIVCHR1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        double moneyDiscount = money * 0.3;
        if (moneyDiscount >= 50000) {
            moneyDiscount =  50000;
        }
        double actualMoney = money - moneyDiscount;
        System.out.println(Math.round(actualMoney));
    }
}
