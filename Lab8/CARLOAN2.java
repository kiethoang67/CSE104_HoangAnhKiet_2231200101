package Lab8;

import java.util.Locale;
import java.util.Scanner;

public class CARLOAN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double P = sc.nextDouble();
        double newP = sc.nextDouble();
        double m = sc.nextDouble();
        int n = sc.nextInt();
        int k = sc.nextInt();
        double L = sc.nextDouble();

        int t = k - 1;
        double X = P * (1.0 - m / 100.0);
        double valueOldCar = P * 0.9 * Math.pow(1.0 - L / 100.0, t);
        double downPaymentNewCar = newP * m / 100.0;
        double debt0 = valueOldCar - downPaymentNewCar;

        double low = 0.0;
        double high = 1.0;
        while (remainingDebt(X, n, t, high) <= debt0) {
            high *= 2.0;
            if (high > 10.0) {
                break;
            }
        }

        while (high - low > 1e-10) {
            double mid = (low + high) / 2.0;
            if (remainingDebt(X, n, t, mid) <= debt0) {
                low = mid;
            } else {
                high = mid;
            }
        }

        System.out.printf("%.4f", high);
    }

    private static double remainingDebt(double X, int n, int t, double annualRate) {
        if (t <= 0) {
            return X;
        }
        if (t >= n) {
            return 0.0;
        }

        double r = annualRate / 12.0;
        if (Math.abs(r) < 1e-15) {
            return X * (n - t) / n;
        }

        double R = 1.0 + r;
        double g = X * Math.pow(R, n) * (R - 1.0) / (Math.pow(R, n) - 1.0);
        return X * Math.pow(R, t) - g * (Math.pow(R, t) - 1.0) / (R - 1.0);
    }
}
