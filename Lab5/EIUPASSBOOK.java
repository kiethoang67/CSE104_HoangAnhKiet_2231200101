package Lab5;

import java.util.Scanner;

public class EIUPASSBOOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double X = sc.nextDouble(); 
        int n = sc.nextInt();
        int m = sc.nextInt();
        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();

        double option1 = X;
        double S = X * Math.pow(1 + r1 / 100.0, n / 12.0);
        double t = (n - m) / 12.0;
        double option2 = S / (1 + r2 / 100.0 * t);

        System.out.println(Math.round(Math.max(option1, option2)));
    }
}



