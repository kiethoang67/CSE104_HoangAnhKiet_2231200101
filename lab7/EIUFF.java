import java.util.Scanner;

class EIUFF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = (double)sc.nextDouble()/100;
        double f = (double)sc.nextDouble()/100;
        int Y = sc.nextInt();
        int N = sc.nextInt();

        double tinh = Y * ((1 - Math.pow((1 + f)/(1 + r), N - 1))/(r - f));
        System.out.printf("%.4f", tinh);
        
    }
}