import java.util.Scanner;

public class EIGROSS {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            double salary = sc.nextDouble();
            double afterTaxIncome = salary/(1-0.1);
            double tax = afterTaxIncome * 0.1;
            System.out.println(tax);
        }
    }
}
