package Lab8;

import java.util.Scanner;

public class EIUBHOUSE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long money = sc.nextLong();      
        long hasMoney = sc.nextLong();   
        int month = sc.nextInt();        
        double rate = sc.nextDouble();  

        long needMoney = money - hasMoney;       
        double principal = (double) needMoney / month;   
        double remaining = needMoney;            
        double r = rate / 100;                   

        for (int i = 1; i <= month; i++) {

            double interest = remaining * r;     
            double monthlyPay = principal + interest;

            System.out.println(i + " " + Math.round(monthlyPay));

            remaining -= principal;              
        }
    }
}