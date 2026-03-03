import java.util.*;

class EIMEMCARD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		long[] require = { 0, 1000000, 20000000, 50000000, 200000000};
		double[] rates = { 0, 0.02, 0.03, 0.05, 0.07};
		long sum = 0;
		int n = sc.nextInt();
		long[] a = new long[n];
		int curlev = 0;
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextLong();
		for (int i = 0; i < a.length; i++) {
			double discount = 0;
			for (int j = require.length - 1; j >=0; j--)
				if (sum >= require[j]) {
					curlev = j;
					break;
				}
			discount = a[i] * rates[curlev];
			sb.append((discount)).append(" ");
			sum += a[i];
		}
		System.out.println(sb);
	}

}