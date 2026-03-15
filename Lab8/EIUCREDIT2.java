package Lab8;
import java.util.Scanner;

public class EIUCREDIT2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double r = sc.nextDouble();
		int t = sc.nextInt();
		long[] transactionPerDay = new long[t + 1];
		for (int j = 0; j < n; j++) {
			int day = sc.nextInt();
			long money = sc.nextLong();
			transactionPerDay[day] += money;
		}
		double balance = 0;
		double debt = 0;
		for (int i = 1; i <= t; i++) {
			if (i % 30 == 1) {
				balance += debt / 30 * r;
				debt = 0;
			}
			balance += transactionPerDay[i];
			if (balance < 0)
				debt += balance;
		}
		System.out.println((balance));
	}

}

