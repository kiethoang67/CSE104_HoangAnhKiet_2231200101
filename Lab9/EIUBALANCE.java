package Lab9;
import java.util.Scanner;

public class EIUBALANCE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        double[] salary = new double[M];

        for (int i = 0; i < M; i++) {
            salary[i] = sc.nextDouble();
        }

        double X = sc.nextDouble(); // chi tiêu ban đầu
        double r = sc.nextDouble(); // lãi suất năm
        double f = sc.nextDouble(); // lạm phát năm

        double save = 0;

        double monthlyRate = r / 100.0 / 12.0;
        double inflationRate = f / 100.0 / 12.0;

        // M tháng làm việc
        for (int i = 0; i < M; i++) {
            save += salary[i] - X;     // tiền dư
            save = save * (1 + monthlyRate); // sinh lãi
            X = X * (1 + inflationRate);     // tăng chi phí
        }

        // M tháng du lịch không lương
        for (int i = 0; i < M; i++) {
            save -= X;                 // chỉ chi tiêu
            save = save * (1 + monthlyRate);
            X = X * (1 + inflationRate);
        }

        if (save < 0) save = 0;

        System.out.println(Math.round(save));

        
    }
}