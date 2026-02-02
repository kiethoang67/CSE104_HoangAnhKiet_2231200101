import java.util.Scanner;

class EIAPP21222FQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        double total = 0;
        for (int i = m; i>0; i--){
            double n = sc.nextDouble();
            total+=cal(n, i);
        }
        System.out.println(Math.round(total));
    }
    public static double cal (double n, int m){
        double[] r = { 0, 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664, 0.0692 };
        int year = m / 12;
        int month = m % 12;
        if (year > 0) {
            n = n * Math.pow(1 + r[12] / 12 * 12, year);
        }
        if (month > 0) {
            n = n * (1 + r[month] / 12 * month);
        }
        return n;
    }
}
