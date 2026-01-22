import java.util.Scanner;

public class EIDISCOUNT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long[] money = {
            5_000_000,
            20_000_000,
            100_000_000,
            300_000_000,
            600_000_000,
            900_000_000,
            Long.MAX_VALUE
        };

        
        int[] discountRate = {0, 3, 5, 7, 10, 12, 15};

        long prev = 0;
        long discount = 0;

        for (int i = 0; i < money.length; i++) {
            if (n > prev) {
                long moneyInLevel = Math.min(n, money[i]) - prev;
                discount += moneyInLevel * discountRate[i] / 100;
                prev = money[i];
            }
        }

        System.out.println(n - discount);
    }
}


