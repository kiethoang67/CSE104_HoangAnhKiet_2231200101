package Lab8;
import java.util.Scanner;
 
class BankLoan2 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();
 
    public static void main(String[] args) {
        long X = sc.nextLong(); 
        double Y = sc.nextDouble();
        int n = sc.nextInt(); 
        double r = sc.nextDouble(); 
        double f = sc.nextDouble();
        calculateLoanRepayment(X, Y, n, r, f);
        System.out.println(sb);
    }
 
    public static void calculateLoanRepayment(double X, double Y, int n, double r, double f) {
        double PerMonthPayment = X / n; 
        double TotalPayment = 0.0;
        double interestRate = r / 100 / 12;
 
        for (int i = 1; i <= 100; i++) {
            if (X <= 0) {
                break;
            }
 
            double rate = X * interestRate;
            double PaymentRequired = PerMonthPayment * i - TotalPayment;
 
            PaymentRequired = Math.max(PaymentRequired, 0);
            double effectivePayment = Y - rate - PaymentRequired;
 
            
            double leftoverPayment = effectivePayment / (1 + f / 100);
 
            TotalPayment += PaymentRequired + leftoverPayment;
            X -= PaymentRequired + leftoverPayment;
 
            sb.append(i).append(" ").append(Math.round(Math.max(X, 0))).append("\n");
        }
    }
}