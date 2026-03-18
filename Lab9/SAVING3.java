package Lab9;
import java.util.*;

public class SAVING3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long tien = sc.nextLong();
        int sThang = sc.nextInt();

        double[] lai = {
            0,
            3.90, 3.92, 3.95, 3.99, 4.04,
            5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92
        };

        double sum = 0;

        for (int k = 1; k <= sThang; k++) {
            int nam = k / 12;
            int thang = k % 12;

            double money = Math.pow(1 + lai[12] / 100.0, nam);

            if (thang > 0) {
                money *= (1 + lai[thang] / 100.0 * thang / 12.0);
            }

            sum += money;
        }

        double x = tien / sum;

        System.out.printf("%.4f\n", x);
    }
}