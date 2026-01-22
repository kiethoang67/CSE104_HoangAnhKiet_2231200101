import java.util.Scanner;

 public class EIUSALES {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int sale = sc.nextInt();
        
        
        long[] brackets = {0, 20, 50, 200, 500, 2000, Long.MAX_VALUE};
        double[] rates = {0.02, 0.03, 0.04, 0.05, 0.06, 0.07}; 
        
        double bonus = 0;
        
        for (int i = 0; i < rates.length; i++) {
            if (sale > brackets[i]) {
                long taxableAmount = Math.min(sale, brackets[i + 1]) - brackets[i];
                if (taxableAmount > 0) {
                    bonus += taxableAmount * rates[i];
                }
            }
        }
        
        
        System.out.print(Math.round(bonus*1000)/1000d);
    }
}