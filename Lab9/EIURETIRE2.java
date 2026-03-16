package Lab9;

import java.util.*;

public class EIURETIRE2 {

    static int N;
    static double r, f;
    static long[] salary;

    static boolean can(double X0) {
        double money = 0;
        double expense = X0;

        double monthlyInterest = r / 100.0 / 12.0;
        double monthlyInflation = f / 100.0 / 12.0;

        for (int i = 0; i < 1200; i++) {

            if (i < N) {
                money += salary[i];
            }

            money -= expense;

            money *= (1 + monthlyInterest);

            expense *= (1 + monthlyInflation);

            if (money < 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        r = sc.nextDouble();
        f = sc.nextDouble();

        salary = new long[N];
        for (int i = 0; i < N; i++) {
            salary[i] = sc.nextLong();
        }

        double left = 0;
        double right = 1e12;

        for (int i = 0; i < 200; i++) {
            double mid = (left + right) / 2;

            if (can(mid))
                left = mid;
            else
                right = mid;
        }

        System.out.println((long) left);
    }
}
