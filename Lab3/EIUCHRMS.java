import java.util.Scanner;

public class EIUCHRMS {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int test = sc.nextInt();
        int thousand = 1000;
        
        long[] money = {0, 2000*thousand, 5000*thousand, 10000*thousand, 20000*thousand,50000*thousand,100000*thousand,200000*thousand};
        double[] rates = {0.03, 0.04, 0.05, 0.06, 0.07,0.08,0.09,0.1}; 
        
        
        long totalMoney = 0;
        for (int i = 0; i < test; i++) {
            long invoice = sc.nextLong();
            for (int j = rates.length-1; j >= 0; j--){
                if(invoice > money[j]){
                    totalMoney += (long)invoice * (1 - rates[j]);
                    break;
                }
            }
        }
        System.out.println(totalMoney);
        
        
        
    }
}
