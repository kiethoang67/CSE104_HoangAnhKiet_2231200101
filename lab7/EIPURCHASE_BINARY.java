import java.util.Scanner;

public class EIPURCHASE_BINARY {

    static double calculate(double X, double r, double G, int T) {
        double debt = X;
        int month = 0;

        while (month < T) {
            debt = debt * (1 + r) - G;
            month++;
        }

        return debt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long V = sc.nextLong();
        int T = sc.nextInt();
        long N = sc.nextLong();
        long M = sc.nextLong();

        double X = V - N;   
        double low = 0.0;
        double high = 1.0;
        double mid;

        while (high - low > Math.pow(10, -7)) {
            mid = (high + low) / 2.0;

            double debt = calculate(X, mid, M, T);

            if (debt > 0)
                high = mid;
            else
                low = mid;
        }

        double r = (high + low) / 2.0;
        System.out.printf("%.3f\n", r);

        
    }
}