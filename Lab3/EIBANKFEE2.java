import java.util.Scanner;

public class EIBANKFEE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soTk = sc.nextInt();
        double totalMoney = 0.0;
        long totalCheck = 0;
        for (int i = 0; i < soTk; i++) {
            double money = sc.nextDouble();
            long soTamSec = sc.nextLong();
            totalCheck += soTamSec;
            double monthlyFee;
            double checkFee;

            if (money < 500) {
                monthlyFee = 12.0;
                checkFee = 0.20;
            } else if (money < 2000) {
                monthlyFee = 7.5;
                checkFee = 0.20;
            } else if (money < 5000) {
                monthlyFee = 5.0;
                checkFee = 0.10;
            } else {
                monthlyFee = 0.0;
                checkFee = 0.0;
            }

            
            totalMoney += monthlyFee + checkFee * soTamSec;
        }
        double fee = totalMoney / totalCheck;
        System.out.printf("%.3f",fee);
    }
}
