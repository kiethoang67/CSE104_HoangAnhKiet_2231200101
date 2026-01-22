import java.util.Scanner;

public class EIBANKFEE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = sc.nextDouble();
        long checks = sc.nextLong();

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

        double total = monthlyFee + checks * checkFee;

        System.out.print(Math.round((double)total*100)/100d);
    }
}
