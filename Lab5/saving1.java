import java.util.Scanner;

class EIAPP21222FQ1 {
    public static void main(String[] args) {
        double[] r = { 0, 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664, 0.0692 };
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int m = sc.nextInt();
        int year = m / 12;
        int month = m % 12;
        if (year > 0) {
            n = n * Math.pow(1 + r[12] / 12 * 12, year);
        }
        if (month > 0) {
            n = n * (1 + r[month] / 12 * month);
        }
        System.out.println(Math.round(n));
    }
}
