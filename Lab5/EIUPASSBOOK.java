import java.util.Scanner;

public class EIUPASSBOOK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong(); // tien
        int n = sc.nextInt(); // thang gui
        int m = sc.nextInt(); // thang rut
        double year = (n - m) / 12;
        double month = (n - m) % 12;
        double r1 = sc.nextDouble() / 100; // lai ngan hang
        double r2 = sc.nextDouble() / 100; // lai rut

        long option1 = X;
        double tinh = X + (X * n * r1) / 12;
        double option2 = tinh / (Math.pow(1 + r2, year) * (1 + (r2 * month) / 12));
        double option = Math.max(option1, option2);
        System.out.println(Math.round(option));
    }
}